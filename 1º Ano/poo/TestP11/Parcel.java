package AvaliacaoAula11;

public class Parcel {
    private int id;
    private String remetente;
    private String destino;
    private double peso;
    private int idCounter = 1;
    
    public static Parcel newParcel (String remetente, String destino, double peso) {
        if (peso > 0)
            return new Parcel (remetente, destino, peso);
        else
            return null;
    }
    
    public static Parcel newParcel (int id, String remetente, String destino, double peso) {
        if (peso > 0 && id > 0)
            return new Parcel (id, remetente, destino, peso);
        else
            return null;
    }
    
    public Parcel (String remetente, String destino, double peso) {
        this.remetente = remetente;
        this.destino = destino;
        this.peso = peso;
        id = idCounter++;
    }
    
    public Parcel (int id, String remetente, String destino, double peso) {
        this.remetente = remetente;
        this.destino = destino;
        this.peso = peso;
        this.id = id;
        idCounter = ++id;
    }
    
    public String toString () {
        return String.format("%d; %f; %s; %s", id, peso, remetente, destino);
    }
    
    public int id () {return id;}
    public double peso () {return peso;}
    public String remetente () {return remetente;}
    public String destino () {return destino;}
}
