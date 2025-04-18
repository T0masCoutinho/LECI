package AvaliacaoAula11;

import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class ParcelManager {
    private Parcel p;
    private HashMap <Integer, Parcel> encomendas = new HashMap <> ();
    private Scanner sc;
    
    public void addParcel (Parcel p) {
        encomendas.put(p.id(), p);
    }
    
    public boolean removeParce (int id) {
        for (int key : encomendas.KeySet()) {
            if (key == id) {
                encomendas.remove(id);
                return true;
            }
        }
        return false;
    }
    
    public Parcel getParcel (int id) {
        for (int key : encomendas.KeySet()) {
            if (key == id)
                p = encomendas.get(id);
                return id;
        }
        return null;
    }
    
    public double calculateShippingCost (int id) {
        for (int key : encomendas.KeySet()) {
            if (key == id) {
                p = encomendas.get(id);
                return StandardShippingCostCalculator (p.peso());
            }
        }
        return -1;
    }
    
    public void printAllParcels () {
        for (int key : encomendas.KeySet()) {
            p = encomendas.get(key);
            System.out.println(p);
        }
    }
    
    public void readFile (String file) {
        String parcelData;
        StringBuilder idS;
        int id;
        StringBuilder remetenteS;
        String remetente;
        StringBuilder destinoS;
        String destino;
        StringBuilder pesoS;
        double peso;
        sc = new Scanner(new File(file));
        
        while (sc.hasNextLine()) {
            parcelData = sc.nextLine();
            for (char elem : parcelData) {
                if (elem.equals(";"))
                    break;
                idS.append(elem);
            }
            for (char elem : parcelData) {
                if (elem.equals(";"))
                    break;
                pesoS.append(elem);
            }
            for (char elem : parcelData) {
                if (elem.equals(";"))
                    break;
                remetenteS.append(elem);
            }
            for (char elem : parcelData) {
                if (elem.equals(";"))
                    break;
                destinoS.append(elem);
            }
            id = idS.toInteger();
            remetente = remetenteS.toString();
            destino = destinoS.toString();
            peso = pesoS.toString();
            p = Parcel.newParcel (id, remetente, destino, peso);
            if (p = null)
                continue;
            encomendas.put(id, p);
        }
    }
    
    public void writeFile (String file) {
        FileWriter fileWriter = new FileWriter("file", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        
        printWriter.append("ID da encomenda; Peso do pacote; Remetente; Destino; Preço");
        for (int key : encomendas.KeySet()) {
            p = encomendas.get(key);
            printWriter.append(p.id() + "; ");
            printWriter.append(p.peso() + "; ");
            printWriter.append(p.remetente() + "; ");
            printWriter.append(p.destino() + "; ");
            printWriter.append(calculateShippingCost(p.id()) + "\n");
        }
    }
    
}





















































