package domain;

public class MoviePriceCalculator implements PrizeCalculator {

    @Override
    public double calculatePrize(int days) {

        double price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;

    }
}
