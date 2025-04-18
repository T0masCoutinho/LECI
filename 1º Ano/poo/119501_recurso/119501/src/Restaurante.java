public class Restaurante extends Local{

    public TipoComida type;

    public Restaurante(String name, TipoComida type){
        super(name);
        this.type = type;
        
    }

    public TipoComida getType(){
        return this.type;
    }

    public void setType(TipoComida type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "Restaurante [type=" + type + "]";
    }
    
    
    


}
