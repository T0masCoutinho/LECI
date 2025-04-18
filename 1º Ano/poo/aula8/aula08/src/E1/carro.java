package E1;

public class carro implements KmsPercorridosInterface{
    public String matricula, marca, modelo; 
    public double potencia;

    private int ultimoTrajeto = 0;
    private int distanciaTotal = 0;

    
    public carro(String matricula,String marca,String modelo, double potencia){
        if(Validates(matricula, marca, modelo, potencia)){
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        }
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String newMatricula){
        this.matricula = newMatricula;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String newMarca){
        this.matricula = newMarca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String newModelo){
        this.matricula = newModelo;
    }

    public double getPotencia(){
        return this.potencia;
    }

    public void setPotencia(String newPotencia){
        this.matricula = newPotencia;
    }

    public void trajeto(int kms) {
        System.out.println("O veículo " + this.getMatricula() + " percorreu " + kms + " quilômetros.");
        this.ultimoTrajeto = kms;
        this.distanciaTotal += kms;
    }

    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }

    public int distanciaTotal() {
        return this.distanciaTotal;
    }

    public boolean Validates(String matricula, String marca, String modelo, double potencia) {
        if (potencia < 0 || matricula == null || marca == null || modelo == null ) {
            throw new IllegalArgumentException("Dados inválidos.\n");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matrícula: " + this.matricula + " Marca: " + this.marca + " Modelo: " + this.modelo
                + " Potência: " + this.potencia;
    }
    

}
