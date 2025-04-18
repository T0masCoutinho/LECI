package Ex1;

public class pessoa {

    protected String nome;
    protected int cc;
    protected DateYMD dataNasc;

    public pessoa(String nome, int cc, DateYMD dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;

    }

    public String getNome(){
        return nome;
    }

    public int getCC(){
        return cc;
    }

    public DateYMD getDataNasc(){
        return dataNasc;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }

    public void setCC(int newCC){
        this.cc = newCC;
    }

    public void setDataNasc(DateYMD newDateYMD){
        this.dataNasc = newDateYMD;
    }

    @Override
    public String toString(){
        return nome + "; CC: " + cc + "; Data de Nascimento" + dataNasc;
    }
}

class Aluno extends pessoa{
    protected int NMec;
    private static int count = 100;
    private DateYMD dataInsc; 

    Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc){
        super(nome, cc, dataNasc);
        this.NMec = Aluno.count;
        Aluno.count += 1;
        this.dataInsc = dataInsc;
    }
        
    Aluno(String nome, int cc, DateYMD dataNasc){
        super(nome, cc, dataNasc);
        this.NMec = Aluno.count;
        Aluno.count += 1;
    }

    public int getNMec(){
        return NMec;
    }

    public DateYMD getDataInsc(){
        return dataInsc;
    }

    public void setNMec(int newNMec){
        this.NMec = newNMec;
    }

    public void setDataInsc(DateYMD newDataInsc){
        this.dataInsc = newDataInsc;
    }

    @Override
    public String toString(){
        return  nome + "; CC: " + cc + "; Data de Nascimento" + dataNasc + "; Nº Mecangrafico: " + NMec;
    }
}

class Professor extends pessoa{
    private String category;
    private String dep;

    Professor(String nome, int cc, DateYMD dataNasc, String category, String dep){
        super(nome, cc, dataNasc);
        this.category = category;
        this.dep = dep;
    }

    public String getCategory(){
        return category;
    }

    public String getDep(){
        return dep;
    }

    public void setCategory(String newCategory){
        this.category = newCategory;
    }

    public void setDep(String newDep){
        this.dep = newDep;
    }

    @Override
    public String toString(){
        return nome + "; CC: " + cc + "; Data de Nascimento" + dataNasc + ";" + category + dep;
    }
}

class Bolseiro extends Aluno{
    private int bolsa;
    private Professor orientador;

    Bolseiro(String nome, int cc, DateYMD dataNasc,Professor orientador, int bolsa){
        super(nome, cc, dataNasc);
        this.bolsa = bolsa;
        this. orientador = orientador;
    }

    public int getBolsa(){
        return bolsa;
    }

    public Professor getOrientador(){
        return orientador;
    }

    public void setBolsa(int newBolsa){
        this.bolsa = newBolsa;
    }

    public void setOrientador(Professor newOrientador){
        this.orientador = newOrientador;
    }

    @Override
    public String toString(){
    return super.toString() + "; Bolsa: " + bolsa + ", Orientador: " + orientador.getNome();
    }
}
   
