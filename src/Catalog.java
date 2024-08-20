import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Catalog{
    final String catalog = "Каталог товаров";
    private List<Category> catalogСategories;

    public Catalog() {
        catalogСategories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        catalogСategories.add(category);
    }

//    public List<Category> getCatalogCategories() {
//        return catalogСategories;
//    }

    public String toString() {
        return catalog + "\n" + "Категории: " + catalogСategories;
    }

    private Comparator<Product> getComporator(List<SortParameter> sortParameters){
        return (product1, product2) -> {
            for (SortParameter parameter : sortParameters){
                int comparison = 0;
                switch (parameter.getNameOfSortParameter()) { // Определяем, по какому полю идет сортировка
                    case "Name":
                        comparison = product1.getNameOfProduct().compareTo(product2.getNameOfProduct());
                        break;
                    case "Price":
                        comparison = Double.compare(product1.getPrice(), product2.getPrice());
                        break;
                    case "Rating":
                        comparison = Double.compare(product1.getRating(), product2.getRating());
                        break;
                }
                if (parameter.getSortingMethod().equals("DESC")) {
                    comparison *= -1; // если порядок DESC, инвертируем результат сравнения
                }
                if (comparison != 0) {
                    return comparison; // если товары не равны, возвращаем результат сравнения
                }
            }
            return 0; // если все критерии равны, возвращаем 0
        };
    }

    // метод для получения отсортированного каталога на основе критериев сортировки
    public Catalog getSortedCatalogByCategories(List<SortParameter> sortParameters) {
        Catalog sortedCatalog = new Catalog(); // Новый каталог для хранения отсортированных категорий

        // Проходим по каждой категории
        for (Category category : catalogСategories) {
            Category sortedCategory = new Category(category.getNameOfCategory()); // Создаем новую категорию с тем же именем

            // Копируем и сортируем товары в категории
            List<Product> sortedProducts = new ArrayList<>(category.getListOfProductsInCategory());
            sortedProducts.sort(getComporator(sortParameters)); // Сортируем товары на основе критериев

            // Добавляем отсортированные товары в новую категорию
            for (Product product : sortedProducts) {
                sortedCategory.addProduct(product);
            }

            // Добавляем новую категорию в новый каталог
            sortedCatalog.addCategory(sortedCategory);
        }

        return sortedCatalog; // Возвращаем новый каталог с отсортированными товарами
    }

    public void printCatalog() {
        System.out.println(catalog+":\n");
        for (Category category : catalogСategories) {
            System.out.println(category.getNameOfCategory());
            System.out.println();
            for (Product product : category.getListOfProductsInCategory()) {
                System.out.println(product);
                System.out.println();
            }
            System.out.println("-------------------------------------------------");
        }
    }


}
