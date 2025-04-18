package AvaliacaoAula11;

public class StandardShippingCostCalculator implements IShippingCostCalculator{
    public double calculateShippingCost (Parcel p) {
        if (p.peso() < 5)
            return p.peso()*3;
        if (p.peso() > 10)
            return p.peso();
        return p.peso()*2;
    }
}
