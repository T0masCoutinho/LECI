package Aula_6.Ex1;

import Aula_5.Ex1.DateYMD;

public class Bolseiro extends Pessoa {
    private float bolsa;
    private String prof;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor professor, float bolsa) {
        super(nome, cc, dataNasc);
        this.prof = professor.getNome();
        this.bolsa = bolsa;
    }

    public String getOrientador() {
        return prof;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override

    public String toString() {
        return super.toString() + "; Orientador: " + prof + "; Bolsa: " + bolsa;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Bolseiro other = (Bolseiro) obj;
        return this.prof.equals(other.prof) && super.equals(obj) && this.bolsa == other.bolsa;
    }
}
