package domain;

public class Movie extends Product {

    public Movie(String id, String title){
        super(id,title);
        this.setPrizeCalculator(new MoviePriceCalculator());
    }

    public double getPrice(int days){
       return this.getPrizeCalculator().calculatePrize(days);
    }

}
