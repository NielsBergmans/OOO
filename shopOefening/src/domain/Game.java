package domain;

public class Game extends Product {

    public Game(String id, String title){
        super(id,title);
        this.setPrizeCalculator(new GamePriceCalculator());
    }

    public double getPrice(int days){
        return this.getPrizeCalculator().calculatePrize(days);
    }

}
