package Aula_4.Ex1;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        if (validateSides(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Triangle triangle = (Triangle) obj;
        return this.side1 == triangle.side1 && this.side2 == triangle.side2 && this.side3 == triangle.side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return (Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3)) * 10.0) / 10.0;
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3 * 10.0) / 10.0;
    }

    @Override

    public String toString() {
        return "Triangle with sides " + this.side1 + ", " + this.side2 + ", " + this.side3 + " has area "
                + this.getArea() + " and perimeter " + this.getPerimeter();
    }

    private boolean validateSides(double side1, double side2, double side3) {
        if (side1 < 0 || side2 < 0 || side3 < 0)
            throw new IllegalArgumentException("Sides cannot be negative.");
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            throw new IllegalArgumentException("Invalid triangle.");
        return true;
    }
}
