public class Local {

    private String name;

    public Local(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Local [name=" + name + "]";
    }


}
