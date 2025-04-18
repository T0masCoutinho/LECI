package avaliacao;

import java.time.LocalDate;

public class Book {
    public int count = 1;
    String name;
    String author;
    String editora;
    String ISBN;
    LocalDate dataLancamento;
    public int id;
   

    public Book(String name, String author, String editora, String ISBN,LocalDate dataLancamento){
        this.name = name;
        this.author = author;
        this.editora = editora;
        this.ISBN = ISBN;
        this.dataLancamento = dataLancamento;
        this.id = count++;
    }

    public Book(String name,String author, String editora, String ISBN,String data){
        this.name = name;
        this.author = author;
        this.editora = editora;
        this.ISBN = ISBN;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEditora() {
        return editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }


    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    
    
    public void setAuthor(String author) {
        this.author = author;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((editora == null) ? 0 : editora.hashCode());
        result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
        result = prime * result + ((dataLancamento == null) ? 0 : dataLancamento.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (editora == null) {
            if (other.editora != null)
                return false;
        } else if (!editora.equals(other.editora))
            return false;
        if (ISBN == null) {
            if (other.ISBN != null)
                return false;
        } else if (!ISBN.equals(other.ISBN))
            return false;
        if (dataLancamento == null) {
            if (other.dataLancamento != null)
                return false;
        } else if (!dataLancamento.equals(other.dataLancamento))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", editora=" + editora + ", ISBN=" + ISBN
                + ", dataLancamento=" + dataLancamento + ", id=" + id + "]";
    }

}
