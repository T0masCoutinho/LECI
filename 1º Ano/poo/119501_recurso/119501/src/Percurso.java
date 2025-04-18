import java.util.*;

public class Percurso {

    private String name;
    private int preco;
    private Transporte transporte;


    public List<Local> viagem = new ArrayList<Local>();


    public Percurso(String name, int preco, Transporte transporte, List<Local> viagem){
        this.transporte = transporte;
        this.name = name;
        this.preco = preco;
        this.viagem = viagem;
    }

    public Percurso(String name, int preco, Transporte transporte){
        this.transporte = transporte;
        this.name = name;
        this.preco = preco;
    }


    public String getName() {
        return name;
    }


    public int getPreco() {
        return preco;
    }


    public Transporte getTransporte() {
        return transporte;
    }


    public List<Local> getViagem() {
        return viagem;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPreco(int preco) {
        this.preco = preco;
    }


    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }


    public void setViagem(List<Local> viagem) {
        this.viagem = viagem;
    }

    public void add(Local local) {
        this.viagem.add(local);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Percurso other = (Percurso) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (preco != other.preco)
            return false;
        if (transporte != other.transporte)
            return false;
        if (viagem == null) {
            if (other.viagem != null)
                return false;
        } else if (!viagem.equals(other.viagem))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Percurso" + name + ", "+ preco + "/pessoa" + ", em" + transporte + ": " + viagem;
    }

    
    

    

    

}
