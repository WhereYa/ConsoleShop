import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
                "1 SIM (nano-SIM/eSIM), влагозащита IP68", 5.0);
        mobilePhones.addProduct(iphone15);

        Product googlePixel8a = new Product("Google Pixel 8a", 1600, "Android (без оболочки), экран 6.1" +
                " OLED (1080x2400) 120 Гц, Google Tensor G3, ОЗУ 8 ГБ, память 128 ГБ, камера 64 Мп, аккумулятор 4492 мАч, 1 SIM (nano-SIM/eSIM), влагозащита IP67", 4.5);
        mobilePhones.addProduct(googlePixel8a);

        Product appleIPhone15ProMax1TB = new Product("Apple iPhone 15 Pro Max Dual SIM 1TB", 6400, "Apple iOS, экран 6.7 OLED (1290x2796) 120 Гц, Apple A17 Pro, ОЗУ 8 ГБ, память 1 ТБ, камера 48 Мп, аккумулятор 4422 мАч, 2 SIM (nano-SIM), влагозащита IP68", 4.7);
        mobilePhones.addProduct(appleIPhone15ProMax1TB);

        Product samsungGalaxyZFold6Sm_F956BDS_12GB_512GB = new Product("Samsung Galaxy Z Fold6 SM-F956B/DS 12GB/512GB", 6600, "Android, экран 7.6\" AMOLED (1856x2160) 120 Гц, Qualcomm Snapdragon 8 Gen 3, ОЗУ 12 ГБ, память 512 ГБ, камера 50 Мп, аккумулятор 4400 мАч, 2 SIM (nano-SIM/eSIM), влагозащита IP48",5.0);
        mobilePhones.addProduct(samsungGalaxyZFold6Sm_F956BDS_12GB_512GB);

        Product samsungGalaxyS23SM_S911B_DS_8GB_128GB = new Product("Samsung Galaxy S23 SM-S911B/DS 8GB/128GB",1900,"Android, экран 6.1\" AMOLED (1080x2340) 120 Гц, Qualcomm Snapdragon 8 Gen2 SM8550, ОЗУ 8 ГБ, память 128 ГБ, камера 50 Мп, аккумулятор 3900 мАч, 2 SIM (nano-SIM/eSIM), влагозащита IP68",4.9);
        mobilePhones.addProduct(samsungGalaxyS23SM_S911B_DS_8GB_128GB);


        Product LenovoIdeaPad3 = new Product("Lenovo IdeaPad 3", 1600, "15.6" +
                " 1920 x 1080, IPS, 60 Гц, Intel Core i3 1215U, 8 ГБ DDR4, SSD 512 ГБ, видеокарта встроенная, без ОС, цвет крышки серый, аккумулятор 45 Вт·ч", 4.8);
        laptops.addProduct(LenovoIdeaPad3);

        Product asusVivobook16X_M3604YA_MB192 = new Product("ASUS Vivobook 16X M3604YA-MB192", 2350.0,"16.0, 1920 x 1200, IPS, 60 Гц, AMD Ryzen 7 7730U, 16 ГБ DDR4, SSD 512 ГБ, видеокарта встроенная, без ОС, цвет крышки серебристый, аккумулятор 42 Вт·ч",4.2);
        laptops.addProduct(asusVivobook16X_M3604YA_MB192);

        Product acerNitro5AN517_55_56V3_NH_QFZEF_001 = new Product("Acer Nitro 5 AN517-55-56V3 NH.QFZEF.001", 3050.0,"17.3\" 1920 x 1080, IPS, 144 Гц, Intel Core i5 12450H, 16 ГБ DDR4, SSD 512 ГБ, видеокарта NVIDIA GeForce RTX 3050 4 ГБ (TGP 90 Вт), Windows 11 Home, цвет крышки черный, аккумулятор 90 Вт·ч",5.0);
        laptops.addProduct(acerNitro5AN517_55_56V3_NH_QFZEF_001);

        Product appleMacbookPro16_2_M3_Max_2023_MUW73 = new Product("Apple Macbook Pro 16.2\" M3 Max 2023 MUW73", 18460.0, "16.2\" 3456 x 2234, IPS, 120 Гц, Apple M3 Max (16 ядер), 48 ГБ, SSD 1024 ГБ, видеокарта встроенная, Mac OS, цвет крышки серебристый, аккумулятор 70 Вт·ч",5.0);
        laptops.addProduct(appleMacbookPro16_2_M3_Max_2023_MUW73);

        Product msi_Vector_GP68HX_13VH_215BY = new Product("MSI Vector GP68HX 13VH-215BY", 11150.0,"16.0\" 1920 x 1200, IPS, 144 Гц, Intel Core i7 13700HX, 16 ГБ DDR5, SSD 1024 ГБ, видеокарта NVIDIA GeForce RTX 4080 12 ГБ (TGP 230 Вт), Windows 11 Home, цвет крышки темно-серый, аккумулятор 90 Вт·ч",4.4);
        laptops.addProduct(msi_Vector_GP68HX_13VH_215BY);

        Product LgGcB509SBSM = new Product("LG GC-B509SBSM", 2799, "Отдельностоящий, полный No Frost, электронное управление, класс A++, " +
                "полезный объём: 384 л (233 + 107 л), инверторный компрессор, зона свежести, перенавешиваемые двери, нулевой зазор, складная полка, лоток для яиц, 59.5x68.2x203 см, черный.", 4.7);
        refrigerators.addProduct(LgGcB509SBSM);

        Product atlant_ХМ_4625_149_ND = new Product("ATLANT ХМ 4625-149-ND",1690.0,"Отдельностоящий, полный No Frost, электронное управление, класс A+, полезный объём: 357 л (211 + 125 л), зона свежести, перенавешиваемые двери, автодоводчик дверей, складная полка, подвесной контейнер, подставка-лоток для бутылок, лоток для яиц, масленка, 59.5x66x206.8 см, нержавеющая сталь.",4.0);
        refrigerators.addProduct(atlant_ХМ_4625_149_ND);

        Product atlant_ХМ_4626_109_ND = new Product("ATLANT ХМ 4626-109 ND",1465.0,"Отдельностоящий, полный No Frost, электронное управление, класс A+, полезный объём: 348 л (254 + 94 л), зона свежести, перенавешиваемые двери, автодоводчик дверей, складная полка, подвесной контейнер, подставка-лоток для бутылок, лоток для яиц, 59.5x66x206.8 см, белый.", 4.1);
        refrigerators.addProduct(atlant_ХМ_4626_109_ND);

        Product samsung_BRB30715EWW_EF = new Product("Samsung BRB30715EWW/EF", 3700.0,"Встраиваемый, полный No Frost, электронное управление, полезный объём: 298 л (224 + 74 л), инверторный компрессор, зона свежести, перенавешиваемые двери, полка для вина, лоток для яиц, 54x55x193.5 см, белый.", 4.7);
        refrigerators.addProduct(samsung_BRB30715EWW_EF);

        Product indesit_ITR_4160_W = new Product("Indesit ITR 4160 W",1114.0, "Отдельностоящий, полный No Frost, механическое управление, класс A, полезный объём: 257 л (179 + 78 л), перенавешиваемые двери, лоток для яиц, 60x64x167 см, белый.",5.0);
        refrigerators.addProduct(indesit_ITR_4160_W);


        List<SortParameter> sortByPrice = DomParser.loadSortParameter("D:\\1_Dev\\ConsoleShop\\src\\Sorting");

        Catalog sortCatalog = catalog.getSortedCatalogByCategories(sortByPrice);
        sortCatalog.printCatalog();



    }
}