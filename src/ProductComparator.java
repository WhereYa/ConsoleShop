import java.util.Comparator;
import java.util.List;

public class ProductComparator implements Comparator<Product> {
    private final List<SortParameter> criteria;     // список критериев сортировки. Каждый объект SortParameter указывает, по какому критерию и порядку нужно сортировать.

    // конструктор принимает список "criteria" с критериями для сравнения объектов "Product", который инициализирует поле класса
    public ProductComparator(List<SortParameter> criteria) {
        this.criteria = criteria;
    }

    // метод выполняет сравнение двух продуктов по конкретному критерию.
    // сначала он получает название сортировки (nameOfParameter) и порядок сортировки (method) из объекта SortCriterion.
    private int compareByCriterion(Product p1, Product p2, SortParameter sortParameterObject) {
        String nameOfParameter = sortParameterObject.getNameOfSortParameter();
        String method = sortParameterObject.getSortingMethod();

        int comparise = 0;

        switch (nameOfParameter) {
            case "Name":
                comparise = p1.getNameOfProduct().compareToIgnoreCase(p2.getNameOfProduct());
                break;
            case "Prise":
                comparise=Double.compare(p1.getPrice(),p2.getPrice());
                break;
            case "Rating":
                comparise=Double.compare(p1.getRating(),p2.getRating());
        }

        // если порядок сортировки указан как "ASC", результат сравнения возвращается как есть. Если порядок "DESC", результат инвертируется
        if ("ASC".equals(method)){
            return comparise;
        }
        else return -comparise;
    }

    // метод проходит по каждому критерию сортировки объектов Product (SortParameter) из списка criteria.
    // для каждого критерия вызывается метод compareByCriterion, который сравнивает два продукта по этому критерию.
    // если результат сравнения не равен нулю (один продукт больше или меньше другого), метод возвращает этот результат.
    // если все критерии дают нулевой результат (равны по всем критериям), метод возвращает 0, что означает, что оба продукта считаются равными.
    @Override
    public int compare(Product p1, Product p2) {
        for (SortParameter creterion: criteria){
            int resultOfCompare = compareByCriterion(p1,p2,creterion);
            if (resultOfCompare!=0){
                return resultOfCompare;
            }
        }
        return 0;
    }
}