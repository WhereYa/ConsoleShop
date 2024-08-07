import java.util.ArrayList;
import java.util.List;

public class Catalog {
    final String catalog = "Каталог товаров";
    private List<Category> catalogСategories;

    public Catalog() {
        catalogСategories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        catalogСategories.add(category);
    }

//    public String getCatalog() {
//        return catalog;
//    }

    public List<Category> getCatalogCategories() {
        return catalogСategories;
    }

    public String toString() {
        return catalog + "\n" + "Категории: " + catalogСategories;
    }

    public void printCatalog() {
        System.out.println(catalog+":\n");
        for (Category category : catalogСategories) {
            System.out.println(category.getNameOfCategory());
            System.out.println();
            for (Product product : category.getNameOfProductInCategoty()) {
                System.out.println(product);
                System.out.println();
            }
            System.out.println("-------------------------------------------------");
        }
    }
}
