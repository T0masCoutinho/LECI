package aula04;

public class triangulo {
    double lado1;
    double lado2;
    double lado3;

    public triangulo(double lado1, double lado2, double lado3) {
        if (!validateSides(lado1, lado2, lado3)) {
            System.out.println("Lados inferiores ou igual a 0, será atribuido o valor 1 a todos os lados");
            this.lado1 = 1;
            this.lado2 = 1;
            this.lado3 = 1;
        } else {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double getLado3() {
        return this.lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        triangulo triangulo = (triangulo) obj;
        return this.lado1 == triangulo.lado1 && this.lado2 == triangulo.lado2 && this.lado3 == triangulo.lado3;
    }

    public double getArea() {
        double s = (this.lado1 + this.lado2 + this.lado3) / 2;
        return (Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3)) * 10.0) / 10.0;
    }

    public double getPerimeter() {
        return ((this.lado1 + this.lado2 + this.lado3) * 10.0) / 10.0;
    }

    @Override

    public String toString() {
        return "triangulo with sides " + this.lado1 + ", " + this.lado2 + ", " + this.lado3 + " has area "
                + this.getArea() + " and perimeter " + this.getPerimeter();
    }

    private boolean validateSides(double lado1, double lado2, double lado3) {
        if (lado1 < 0 || lado2 < 0 || lado3 < 0)
            throw new IllegalArgumentException("Sides cannot be negative.");
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1)
            throw new IllegalArgumentException("Invalid triangulo.");
        return true;
    }

}
