package teste2;

public class Place {
    private String place_name;
    public int place_capacity;

    public Place(String place_name, int place_capacity){
        this.place_name = place_name;
        this.place_capacity = place_capacity;
    }

    public String getPlace_name() {
        return place_name;
    }

    public int getPlace_capacity() {
        return place_capacity;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public void setPlace_capacity(int place_capacity) {
        this.place_capacity = place_capacity;
    }

    @Override
    public String toString() {
        return "Place [place_name=" + place_name + ", place_capacity=" + place_capacity + "]";
    }

    
}
