public class CategoryMaxJson {
    private MaxJson maxCategory;
    private MaxJson maxYearCategory;
    private MaxJson maxMonthCategory;
    private MaxJson maxDayCategory;


    public CategoryMaxJson(MaxJson maxCategory, MaxJson maxYearCategory, MaxJson maxMonthCategory, MaxJson maxDayCategory) {
        this.maxCategory = maxCategory;
        this.maxYearCategory = maxYearCategory;
        this.maxMonthCategory = maxMonthCategory;
        this.maxDayCategory = maxDayCategory;
    }

    public MaxJson getMaxCategory() {
        return maxCategory;
    }

    public void setMaxCategory(MaxJson maxCategory) {
        this.maxCategory = maxCategory;
    }

    public MaxJson getMaxYearCategory() {
        return maxYearCategory;
    }

    public void setMaxYearCategory(MaxJson maxYearCategory) {
        this.maxYearCategory = maxYearCategory;
    }

    public MaxJson getMaxMonthCategory() {
        return maxMonthCategory;
    }

    public void setMaxMonthCategory(MaxJson maxMonthCategory) {
        this.maxMonthCategory = maxMonthCategory;
    }

    public MaxJson getMaxDayCategory() {
        return maxDayCategory;
    }

    public void setMaxDayCategory(MaxJson maxDayCategory) {
        this.maxDayCategory = maxDayCategory;
    }

    @Override
    public String toString() {
        return "CategoryMaxJson{" +
                "maxCategory=" + maxCategory +
                ", maxYearCategory=" + maxYearCategory +
                ", maxMonthCategory=" + maxMonthCategory +
                ", maxDayCategory=" + maxDayCategory +
                '}';
    }
}
