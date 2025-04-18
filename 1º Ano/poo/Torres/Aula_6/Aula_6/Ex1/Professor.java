package Aula_6.Ex1;

import Aula_5.Ex1.DateYMD;

public class Professor extends Pessoa {
    private String categoria;
    private String dep;

    public Professor(String nome, int cc, DateYMD dataNasc, String categoria, String dep) {
        super(nome, cc, dataNasc);
        this.categoria = categoria;
        this.dep = dep;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDep() {
        return dep;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override

    public String toString() {
        return super.toString() + "; Categoria: " + categoria + "; Departamento: " + dep;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Professor other = (Professor) obj;
        return this.categoria.equals(other.categoria) && this.dep.equals(other.dep) && super.equals(obj);
    }
}
