package Aula_6.Ex2;

import Aula_6.Ex1.Pessoa;

public class Contacto {
    private int id;
    private Pessoa pessoa;
    private int telefone;
    private String email;
    private static int nextId = 1;

    public Contacto(Pessoa pessoa, int telefone, String email) {
        this.id = nextId++;
        this.pessoa = pessoa;
        if (validateTelefone(telefone)) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido!");
            return;
        }
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email inválido!");
            return;
        }
    }

    public Contacto(Pessoa pessoa, String email) {
        this.pessoa = pessoa;
        this.id = nextId++;
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email inválido!");
        }
    }

    public Contacto(Pessoa pessoa, int telefone) {
        this.pessoa = pessoa;
        this.id = nextId++;
        if (validateTelefone(telefone)) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido!");
        }
    }

    public int getId() {
        return id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[ID: " + id + "; Nome: " + pessoa.getNome() + "; Telefone: " + telefone + "; Email: " + email + "]";
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Contacto other = (Contacto) obj;
        return this.id == other.id && this.pessoa.equals(other.pessoa) && this.telefone == other.telefone
                && this.email.equals(other.email);
    }

    public static boolean validateTelefone(int telefone) {
        String telefoneString = Integer.toString(telefone);
        if (telefoneString.length() == 9 && telefoneString.charAt(0) == '9') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateEmail(String email) {
        if (email.contains("@") && (email.endsWith(".com") || email.endsWith(".pt") || email.endsWith(".org")
                || email.endsWith(".net") || email.endsWith(".edu"))) {
            return true;
        } else {
            return false;
        }
    }

}
