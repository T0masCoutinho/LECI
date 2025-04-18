package avaliacao;

public class BookCostCalculator implements IBookCostCalculator{
    public double calculateCost(int days){
        if(days <= 6 ){
            return 3.00;
        }
        if(days > 6 ){
            return 3.00 + (0.8 * days);
        }
    }
}
