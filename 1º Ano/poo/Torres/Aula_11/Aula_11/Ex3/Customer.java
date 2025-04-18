package Aula_11.Ex3;

import java.util.ArrayList;

public class Customer {
    private int customerId;
    private ArrayList<Double> meterReadings;

    public Customer(int customerId, ArrayList<Double> meterReadings) {
        this.customerId = customerId;
        this.meterReadings = meterReadings;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Double> getMeterReadings() {
        return meterReadings;
    }

    public void setMeterReadings(ArrayList<Double> meterReadings) {
        this.meterReadings = meterReadings;
    }
}
