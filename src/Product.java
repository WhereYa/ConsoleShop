public class Product {
    private String nameOfProduct;
    private double price;
    private String description;
    private double rating;

    Product(String nameOfProduct, double price, String description, double rating) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.description = description;
        this.rating=rating;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }

    public String toString() {
        return "Наименование товара: " + nameOfProduct + "\n" +
                "Цена=" + price + " BYN\n" +
                "Описание товара: " + description + ".\n"+
                "Оценка товара: "+ rating+".";
    }
}
