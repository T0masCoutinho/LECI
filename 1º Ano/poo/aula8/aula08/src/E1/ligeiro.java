package E1;

public class ligeiro extends carro {
    public double cap_bag;
    public int quadro;

    public ligeiro(String matricula,String marca,String modelo, double potencia, int quadro, double cap_bag){
        super(matricula, marca, modelo, potencia);
        if(super.Validates(matricula, marca, modelo, potencia) || Validates(cap_bag)){
            this.cap_bag = cap_bag;
            this.quadro = quadro;
        }
    }

    public double getCap_bag(){
        return this.cap_bag;
    }

    public void setCap_bag(double newCapBag){
        this.cap_bag = newCapBag;
    }

    public double getQuadro(){
        return this.quadro;
    }

    public void setQuadro(String newQuadro){
        this.matricula = newQuadro;
    }

    @Override
    public String toString(){
        return "Automóvel Ligeiro --> Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Potência(cv): " + potencia + ", Capacidade de Bagageira: " + cap_bag;
    }

    public boolean Validates(double cap_bag){
        if(cap_bag < 0 || quadro < 0){
            throw new IllegalArgumentException("Dados inválidos.\n");}
        return true;
    }

}
