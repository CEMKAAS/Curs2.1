public class MaxJson {
    private String category;
    private Integer sum;

    public MaxJson(String category, Integer sum) {
        this.category = category;
        this.sum = sum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "MaxJson{" +
                ", category='" + category + '\'' +
                ", sum=" + sum +
                '}';
    }
}
