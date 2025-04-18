package E1;

public class motociclo extends carro{
    public String tipo;

    public motociclo(String matricula,String marca,String modelo, double potencia, String tipo){ 
        super(matricula, marca, modelo, potencia);
        if (super.Validates(matricula, marca, modelo, potencia) || Validates(tipo)){
        this.tipo = tipo;}
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String newTipo){
        this.tipo = newTipo;
    }

    @Override
    public String toString(){
        return "Motociclo --> Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Potência(cv): " + potencia + ", Tipo(desportivo ou estrada): " + tipo;
    }

    public boolean Validates(String tipo){
        if(!(tipo == "deportivo") || (tipo == "estrada")){
            throw new IllegalArgumentException("Dados inválidos.\n");
        }
        return true;
    }

}
