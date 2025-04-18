package AvaliacaoAula11;

public class ShippingTester {
    public static void main(String[] args) {
        ParcelManager pm = new ParcelManager();

        // ----------------------------------------------------------
        Parcel p1 = Parcel.newParcel("Aveiro, Portugal", "Madrid, Spain", 10);
        Parcel p2 = Parcel.newParcel("Dublin, Ireland", "Berlin, Germany", 15);
        pm.addParcel(p1);
        pm.addParcel(p2);
        // ----------------------------------------------------------

        pm.printAllParcels();

        // ----------------------------------------------------------
        System.out.println(pm.getParcel(1));
        System.out.println(pm.calculateShippingCost(1));
        System.out.println(pm.getParcel(2));
        System.out.println(pm.calculateShippingCost(2));
        System.out.println(pm.getParcel(30));              // não existe!
        System.out.println(pm.calculateShippingCost(30));  // não existe!
        // ----------------------------------------------------------

        pm.readFile("encomendas.txt");
        pm.printAllParcels();

        // ----------------------------------------------------------
        System.out.println(pm.getParcel(1));
        System.out.println(pm.calculateShippingCost(1));
        System.out.println(pm.getParcel(2));
        System.out.println(pm.calculateShippingCost(2));
        System.out.println(pm.getParcel(30));
        System.out.println(pm.calculateShippingCost(30));
        // ----------------------------------------------------------

        pm.writeFile("resultado.txt");

    }
}
