package domain;

public class GamePriceCalculator implements PrizeCalculator {

    @Override
    public double calculatePrize(int days) {
        return days * 3;
    }

}
