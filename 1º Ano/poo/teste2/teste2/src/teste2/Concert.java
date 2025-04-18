package teste2;

public class Concert extends Event {
    public String art_name;

    public Concert(String name, String art_name, int duration){
        super(name, duration);
        this.art_name = art_name;
    }

    public String getArt_name() {
        return art_name;
    }

    public void setArt_name(String art_name) {
        this.art_name = art_name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((art_name == null) ? 0 : art_name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Concert other = (Concert) obj;
        if (art_name == null) {
            if (other.art_name != null)
                return false;
        } else if (!art_name.equals(other.art_name))
            return false;
        return true;
    }

    @Override
    public String toString() {
         return super.toString() + "Concert by " + art_name;
    }

    
}
