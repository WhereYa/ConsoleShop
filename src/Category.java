import java.util.ArrayList;
import java.util.List;

public class Category {
    private String nameOfCategory;
    private List<Product> productsInCategory;

    public Category(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
        this.productsInCategory = new ArrayList<>();
    }

    public void addProduct(Product nameOfProduct) {
        productsInCategory.add(nameOfProduct);
    }

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public List<Product> getListOfProductsInCategory() {
        return productsInCategory;
    }

    public String toString() {
        return "Наименование категории:" + nameOfCategory + "\n" +
                "Товары категории: " + productsInCategory + ".";
    }
}
