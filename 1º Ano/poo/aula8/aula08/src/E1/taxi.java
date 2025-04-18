package E1;

public class taxi extends ligeiro {
    public double licenca;
    

    public taxi(String matricula,String marca,String modelo, double potencia, int quadro, double cap_bag, double licenca){
        super(matricula, marca, modelo, potencia, quadro, cap_bag);
        this.licenca = licenca;
    }

    public double getLiceca(){
        return this.licenca;
    }

    public void setLiceca(double newLicenca){
        this.licenca = newLicenca;
    }

    @Override
    public String toString(){
        return "Táxi --> Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Potência(cv): " + potencia + ", Capacidade de Bagageira: " + cap_bag + "Nº de Licença: " + licenca;
    }


}
