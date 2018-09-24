package domain;

public abstract class Product {


    private String id;
    private String title;
    private PrizeCalculator prizeCalculator;

    public Product(String id, String title) {
        this.setId(id);
        this.setTitle(title);
    }

    public void setPrizeCalculator(PrizeCalculator prizeCalculator) {
        this.prizeCalculator = prizeCalculator;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PrizeCalculator getPrizeCalculator() {
        return prizeCalculator;
    }

    public abstract double getPrice(int nrOfDays);
}
