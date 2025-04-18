package Aula_4.Ex4;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

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
}
