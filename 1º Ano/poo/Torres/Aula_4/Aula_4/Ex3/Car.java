package Aula_4.Ex3;

class Car {
    private String make;
    private String model;
    private int year;
    private int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        kms += distance;
    }

    public String toString() {
        return String.format("%s %s, %d, kms: %d", make, model, year, kms);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKms() {
        return kms;
    }
}