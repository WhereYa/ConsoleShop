// объекты класса содержат информацию о том, как должны сортироваться товары "SortCriterion priceAsc = new SortCriterion("Price", "ASC");"
public class SortParameter {
    private String nameOfSortParameter;
    private String sortingMethod;
    SortParameter(String nameOfSortParameter, String sortingMethod){
        this.nameOfSortParameter=nameOfSortParameter;
        this.sortingMethod=sortingMethod;
    }

    public String getNameOfSortParameter() {
        return nameOfSortParameter;
    }

    public String getSortingMethod() {
        return sortingMethod;
    }

    @Override
    public String toString() {
        return "Сортировка по параметру:" + nameOfSortParameter + "\n" +
                "Способ сортировки: " + sortingMethod + ".";
    }
}
