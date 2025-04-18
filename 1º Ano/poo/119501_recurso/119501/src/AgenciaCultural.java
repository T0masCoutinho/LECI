import java.util.*;


public class AgenciaCultural implements Listavel {

    private String name;
    private String address;



    TreeMap<Percurso, String> percursoMap = new TreeMap<>();

    public AgenciaCultural(String name, String address, TreeMap<Percurso, String> percursoMap){
        this.address = address;
        this.name = name;
        this.percursoMap = percursoMap;
    }

    public AgenciaCultural(String name, String address){
        this.address = address;
        this.name = name;
    }


	public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public TreeMap<Percurso, String> getPercursoMap() {
        return percursoMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPercursoMap(TreeMap<Percurso, String> percursoMap) {
        this.percursoMap = percursoMap;
    }

    //public void add(Percurso percursoMap) {    //Forma de adicionar vários percursos à Agencia
    //    this.percursoMap.add(percursoMap);
    //}

    @Override
    public Collection<String> percursos(){
        return percursoMap.values();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AgenciaCultural other = (AgenciaCultural) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (percursoMap == null) {
            if (other.percursoMap != null)
                return false;
        } else if (!percursoMap.equals(other.percursoMap))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AgenciaCultural [name=" + name + ", address=" + address + ", percursoMap=" + percursoMap + "]";
    }

}


