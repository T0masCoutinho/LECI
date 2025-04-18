package aula04;

public class circulo {

    double raio;

    public circulo(double raio){
        if (validateRadius(raio))
            this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        circulo circle = (circulo) obj;
        return this.raio == circle.raio;
    }

    public double getPerimeter(){
       return Math.PI * 2 * raio;
    }

    public double getArea(){
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circle with radius " + this.raio + " has area " + this.getArea() + " and perimeter "
                + this.getPerimeter();
    }

    private boolean validateRadius(double radius) {
        if (raio < 0)
            throw new IllegalArgumentException("Radius cannot be negative.");
        return true;
    }

}
