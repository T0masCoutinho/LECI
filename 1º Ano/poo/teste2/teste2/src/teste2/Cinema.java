package teste2;

import java.util.Arrays;

public class Cinema extends Event {
    public String diretor;
    public int year;
    String[] actor;
    
    public Cinema(String name, String diretor, int year, String[] actor, int duration ){
        super(name, duration);
        this.diretor = diretor;
        this.year = year;
        this.actor = actor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getYear() {
        return year;
    }

    public String[] getActor() {
        return actor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((diretor == null) ? 0 : diretor.hashCode());
        result = prime * result + year;
        result = prime * result + Arrays.hashCode(actor);
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
        Cinema other = (Cinema) obj;
        if (diretor == null) {
            if (other.diretor != null)
                return false;
        } else if (!diretor.equals(other.diretor))
            return false;
        if (year != other.year)
            return false;
        if (!Arrays.equals(actor, other.actor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cinema [diretor=" + diretor + ", year=" + year + ", actor=" + Arrays.toString(actor) + "]";
    }

    
}
