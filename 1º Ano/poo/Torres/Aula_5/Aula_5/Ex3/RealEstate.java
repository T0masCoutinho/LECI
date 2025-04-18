package Aula_5.Ex3;

import java.util.ArrayList;

public class RealEstate {

    private ArrayList<Property> properties;
    private int nextId;

    public RealEstate() {
        this.properties = new ArrayList<Property>();
        this.nextId = 1000;
    }

    public void newProperty(String location, int rooms, int price) {
        int id = this.nextId;
        this.nextId++;
        Property property = new Property(location, rooms, price);
        this.properties.add(property);

    }

    public void sell(int id) {
        Property property = getPropertyById(id);
        if (property == null) {
            System.out.println("Immobile " + id + " doesn't exist.");
            return;
        } else {
            property.sell();
            return;
        }
    }

    public void setAuction(int id, DateYMD dateYMD, int auctionDurationDays) {
        Property property = getPropertyById(id);
        if (property == null) {
            System.out.println("Immovel " + id + " doesn't exist.");
            return;
        } else {
            property.setAuction(dateYMD, auctionDurationDays);
            return;
        }
    }

    private Property getPropertyById(int id) {
        for (Property property : properties) {
            if (property.getId() == id) {
                return property;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (Property property : properties) {
            result += property.toString() + "\n";
        }
        return result;
    }

}
