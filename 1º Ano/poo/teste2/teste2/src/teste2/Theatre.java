package teste2;

public class Theatre extends Event{
    public String author;
    public String obra_name;
    public String company_name;

    public Theatre(String name,String author, String obra_name, String company_name,  int duration){
        super(name, duration);
        this.author = author;
        this.company_name = company_name;
        this.obra_name = obra_name;
    }

    public Theatre(String name,String author, String company_name,  int duration){
        super(name, duration);
        this.author = author;
        this.company_name = company_name;
    }
    

    public String getAuthor() {
        return author;
    }

    public String getObra_name() {
        return obra_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setObra_name(String obra_name) {
        this.obra_name = obra_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((obra_name == null) ? 0 : obra_name.hashCode());
        result = prime * result + ((company_name == null) ? 0 : company_name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Theatre other = (Theatre) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (obra_name == null) {
            if (other.obra_name != null)
                return false;
        } else if (!obra_name.equals(other.obra_name))
            return false;
        if (company_name == null) {
            if (other.company_name != null)
                return false;
        } else if (!company_name.equals(other.company_name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return obra_name + "[" + duration + "] , theatre play by " + author + ", performed by " + company_name;
    }

    
}
