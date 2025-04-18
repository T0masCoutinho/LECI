package E1;

public class pesadoPass extends carro {
    public double peso, nPass;
    public int quadro;

    public pesadoPass(String matricula,String marca,String modelo, double potencia, int quadro, double peso, double nPass){
        super(matricula, marca, modelo, potencia);
        if(super.Validates(matricula, marca, modelo, potencia) || Validates(peso, nPass)){
        this.peso = peso;
        this.quadro = quadro;
        this.nPass = nPass;}
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double newPeso){
        this.peso = newPeso;
    }

    public double getCarga(){
        return this.nPass;
    }

    public void setCarga(double newNPa){
        this.nPass = newNPa;
    }

    public double getQuadro(){
        return this.quadro;
    }

    public void setQuadro(String newQuadro){
        this.matricula = newQuadro;
    }

    @Override
    public String toString(){
        return "Pesado de Mercadorias --> Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Potência(cv): " + potencia + ", Peso: " + peso + ", Nº de Passageiros: " + nPass;
    }

    public boolean Validates(double peso, double nPass){
        if(peso < 0 ||nPass < 0){
            throw new IllegalArgumentException("Dados inválidos.\n");}
        return true;
    }

}
