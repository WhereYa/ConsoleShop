public class Product {
    private String nameOfProduct;
    private double price;
    private String description;
    Product(String nameOfProduct, double price, String description){
        this.nameOfProduct=nameOfProduct;
        this.price=price;
        this.description=description;
    }
    public String getNameOfProduct(){
        return nameOfProduct;
    }
    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public String toString(){
        return "Наименование товара: " + nameOfProduct+"\n" +
                "Цена=" + price +" BYN\n"+
                "Описание товара: " + description+".";
    }
}
