public class SitioCultural extends Local {

    public TipoCultural placeType;
    public GamaPrecos gamaPrecos;

    public SitioCultural(String name, TipoCultural placeType, GamaPrecos gaPreco){
        super(name);
        this.placeType = placeType;
    }

    public TipoCultural getPlaceType() {
        return placeType;
    }

    public GamaPrecos getGamaPrecos() {
        return gamaPrecos;
    }

    public void setPlaceType(TipoCultural placeType) {
        this.placeType = placeType;
    }

    public void setGamaPrecos(GamaPrecos gamaPrecos) {
        this.gamaPrecos = gamaPrecos;
    }

    @Override
    public String toString() {
        return super.toString() + "SitioCultural [placeType=" + placeType + ", gamaPrecos=" + gamaPrecos + "]";
    }


    

}
