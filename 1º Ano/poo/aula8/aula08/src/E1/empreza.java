package E1;

import java.util.ArrayList;


public class empreza {

    private String nome;
    private String codigoPostal;
    private String email;

    private ArrayList<carro> vehiculos;

    public empreza(String nome, String codigoPostal, String email){
        validateEmail(email);
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.vehiculos = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }

    public String setCodigoPostal(){
        return this.codigoPostal;
    }

    public void setCodigoPostal(String newCodigoPostal){
        this.nome = newCodigoPostal;
    }

    public String setEmail(){
        return this.email;
    }

    public void setEmail(String newEmail){
        this.nome = newEmail;
    }

    public ArrayList<carro> getVehiculo(){
        return vehiculos;
    }

    public void addVehiculo(carro vehiculo){
        this.vehiculos.add(vehiculo);
    }

    public void addVehiculo(carro... vehiculo){
        for (carro v : vehiculo){
            addVehiculo(v);
        }
    }

    public boolean validateEmail(String email){
        if( email == null){
            throw new IllegalArgumentException("Email não pode ser vazio");
        }
        return true;
    }

    @Override
    public String toString(){
        return "Empresa --> nome: " + nome + ", Código Postal: " + codigoPostal + " Email: " + email + "Vehiculos: " + vehiculos;
    }


}
