package Aula_6.Ex1;

import Aula_5.Ex1.DateYMD;
import java.time.LocalDate;

public class Aluno extends Pessoa {
    // ... definição de atributos
    private final int NMec;
    private DateYMD iDataIns;
    private static int nextNMec = 100;

    public Aluno(String iNome, int iBI, DateYMD iDataNasc, DateYMD iDataIns) {
        super(iNome, iBI, iDataNasc);
        this.NMec = nextNMec++;
        this.iDataIns = iDataIns;
    }

    public Aluno(String iNome, int iBI, DateYMD iDataNasc) {
        super(iNome, iBI, iDataNasc);
        this.NMec = nextNMec++;
        this.iDataIns = getCurrentDate();
    }

    public int getNMec() {
        return NMec;
    } // retorna o número mecanográfico

    public DateYMD getIDataIns() {
        return iDataIns;
    } // retorna a data de inscrição

    public void setIDataIns(DateYMD iDataIns) {
        this.iDataIns = iDataIns;
    } // altera a data de inscrição

    @Override

    public String toString() {
        return super.toString() + "; NMec: " + NMec + "; Data de Inscrição: " + iDataIns;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Aluno other = (Aluno) obj;
        return this.NMec == other.NMec && this.iDataIns.equals(other.iDataIns) && super.equals(obj);
    }

    private DateYMD getCurrentDate() {
        LocalDate localDate = LocalDate.now();
        return new DateYMD(localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
    }
}
