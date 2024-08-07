public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Category mobilePhones = new Category("Мобильные телефоны.");
        catalog.addCategory(mobilePhones);

        Category laptops = new Category("Ноутбуки.");
        catalog.addCategory(laptops);

        Category refrigerators = new Category("Холодильники");
        catalog.addCategory(refrigerators);


        Product iphone15 = new Product("Apple Iphone 15", 2500, "Apple iOS, экран 6.1, " +
                "OLED (1179x2556) 60 Гц, Apple A16 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 48 Мп, аккумулятор 3349 мАч, " +
                "1 SIM (nano-SIM/eSIM), влагозащита IP68");
        mobilePhones.addProduct(iphone15);

        Product googlePixel8a = new Product("Google Pixel 8a", 1600, "Android (без оболочки), экран 6.1" +
                " OLED (1080x2400) 120 Гц, Google Tensor G3, ОЗУ 8 ГБ, память 128 ГБ, камера 64 Мп, аккумулятор 4492 мАч, 1 SIM (nano-SIM/eSIM), влагозащита IP67");
        mobilePhones.addProduct(googlePixel8a);

        Product LenovoIdeaPad3 = new Product("Lenovo IdeaPad 3",1600,"15.6" +
                " 1920 x 1080, IPS, 60 Гц, Intel Core i3 1215U, 8 ГБ DDR4, SSD 512 ГБ, видеокарта встроенная, без ОС, цвет крышки серый, аккумулятор 45 Вт·ч");
        laptops.addProduct(LenovoIdeaPad3);

        Product LgGcB509SBSM = new Product("LG GC-B509SBSM", 2799,"Отдельностоящий, полный No Frost, электронное управление, класс A++, " +
                "полезный объём: 384 л (233 + 107 л), инверторный компрессор, зона свежести, перенавешиваемые двери, нулевой зазор, складная полка, лоток для яиц, 59.5x68.2x203 см, черный.");
        refrigerators.addProduct(LgGcB509SBSM);

        catalog.printCatalog();
    }
}