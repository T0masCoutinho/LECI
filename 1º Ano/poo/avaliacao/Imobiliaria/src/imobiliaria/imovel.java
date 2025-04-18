package imobiliaria;

public class imovel {
    public String morada;
    public double preço;
    public double area;
    public static int count = 100;
    public Object id;
    
    public imovel(String morada, double preço, double area){

        if (!validate(preço, area)) {
            System.out.println("Valores invalidos");
            
        }

        else{
        this.morada = morada;
        this.preço = preço;
        this.area = area;
        this.id = imovel.count;
        imovel.count+=1;
        }

        
    }

    public String getMorada(){
        return this.morada;
    }

    public double getPreço(){
        return this.preço;
    }

    public double getArea(){
        return this.area;
    }

    public Object getID(){
        return this.id;
    }

    public String setMorada(String newMorada){
        return this.morada = newMorada;
    }

    public double setPreço(double newPreço){
        return this.preço = newPreço;
    }

    public double setArea(double newArea){
        return this.area = newArea;
    }

    public Object setID(Object newID){
        return this.id = newID;
    }

    private boolean validate(double preço, double area) {
        if (preço < 0 || area < 0)
            throw new IllegalArgumentException("Sides cannot be negative.");
        return true;
    }

    @Override
    public String toString(){
        return "Morada: " + this.morada + "; Preço base de venda: " + this.preço + "; Área total: " + this.area + "; ID: " + this.id;
    }


    

    

}
