// Класс для чтения XML-файла, загружает критериев сортировки из XML-файла и создания соответствующий список объектов SortParameter
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DomParser {

    public static List<SortParameter> loadSortParameter(String pathToXML){   // Метод для загрузки критериев сортировки из XML-файла
        List<SortParameter> criteria = new ArrayList<>();
        try {
            // открываем XML-файл
            File file = new File(pathToXML);

            // создаётся фабрика для создания объектов DocumentBuilder, которые будут использоваться для обработки XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            // объект DocumentBuilder будет читать и парсить XML-документ.
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // метод dBuilder.parse() XML-файл и создаёт объект Document, представляющий дерево узлов XML-документа. Этот объект Document позволяет работать с XML-документом как с объектом в памяти, а не как с файлом на диске.
            Document document = dBuilder.parse(file);

            // метод document.getDocumentElement().normalize() приводит документ к стандартной форме, что помогает избежать проблем с избыточными пробелами или переносами строк.
            document.getDocumentElement().normalize();

            // Метод getElementsByTagName возвращает NodeList, содержащий все элементы XML-документа с указанным тегом.
            // Здесь это элементы с тегом <SortParameter>. Таким образом, метод ищет в XML-документе все узлы (элементы) с тегом <SortParameter> и возвращает их в виде списка узлов NodeList.
            NodeList nodeList = document.getElementsByTagName("SortParameter");
            for (int i = 0; i<nodeList.getLength(); i++){   //.getLength() - кол-во ущлов в листе

                // Element — интерфейс в Java для работы с XML, который представляет собой элемент XML-документа, который может содержать атрибуты, текст, другие элементы
                // метод item(i) возвращает узел (элемент) на позиции i в NodeList. Возвращаемые методом item(i) узлы имеют тип Node (общий тип для всех узлов XML-документа)
                // нам нужны именно XML-элементы, чтобы получить доступ к его содержимому (тегам и их содержимым), поэтому узел приводится к типу Element. Это позволяет вам использовать методы класса Element
                // на каждой итерации цикла вы работаете с очередным элементом <SortCriterion>.
                Element elementWithSortParameter = (Element) nodeList.item(i);

                // Этот код находит тег <Parameter> внутри текущего элемента <SortParameter>.
                // Сначала используется getElementsByTagName("Parameter"), чтобы получить список всех элементов <Parameter> внутри текущего <SortParameter>.
                // в XML ожидается только один элемент <Parameter> внутри каждого <SortParameter>, поэтому используется item(0) для получения единственного такого элемента.
                // getTextContent() извлекает текстовое содержимое тега <Parameter>, например, "Price", "Name" или "Rating", и сохраняет его в строку parameter.
                String parameter = elementWithSortParameter.getElementsByTagName("Parameter").item(0).getTextContent();
                String method = elementWithSortParameter.getElementsByTagName("Method").item(0).getTextContent();

                // на основе извлеченных значений parameter и method создается новый объект SortParameter.
                // этот объект добавляется в список criteria, который по окончании цикла будет содержать все критерии сортировки из XML-файла.
                criteria.add(new SortParameter(parameter,method));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return criteria;
    }
}
