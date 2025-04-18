package Aula_6.Ex1;

import Aula_5.Ex1.DateYMD;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public int getCC() {
        return cc;
    }

    public DateYMD getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override

    // toString like this "Ana Santos; CC: 98012244; Data de Nascimento: 5/10/1988"

    public String toString() {
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc;
    }
}