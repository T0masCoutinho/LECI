package E1;

public class pesadoMerc extends carro {
    public double peso, cargaMax;
    public int quadro;

    public pesadoMerc(String matricula,String marca,String modelo, double potencia, int quadro, double peso, double cargaMax){
        super(matricula, marca, modelo, potencia);
        if(super.Validates(matricula, marca, modelo, potencia) || Validates(peso, cargaMax)){
        this.peso = peso;
        this.quadro = quadro;
        this.cargaMax = cargaMax;}
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double newPeso){
        this.peso = newPeso;
    }

    public double getCarga(){
        return this.cargaMax;
    }

    public void setCarga(double newCargaMax){
        this.cargaMax = newCargaMax;
    }

    public double getQuadro(){
        return this.quadro;
    }

    public void setQuadro(String newQuadro){
        this.matricula = newQuadro;
    }

    @Override
    public String toString(){
        return "Pesado de Mercadorias --> Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Potência(cv): " + potencia + ", Peso: " + peso + ", Carga Máxima: " + cargaMax;
    }

    public boolean Validates(double peso, double cargaMax){
        if(peso < 0 ||cargaMax < 0){
            throw new IllegalArgumentException("Dados inválidos.\n");}
        return true;
    }

}
