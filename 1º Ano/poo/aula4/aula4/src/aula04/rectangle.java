package aula04;

public class rectangle {
    double width;
    double length;

    public rectangle(double width, double length) {

        if (!validateSides(width, length)) {
            System.out.println("Lados inferiores ou igual a 0, será atribuido o valor 1 a todos os lados");
            this.width = 1;
            this.length = 1;

        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return ((this.length * this.width) * 10.0) / 10.0;
    }

    public double getPerimeter() {
        return ((2 * this.length + 2 * this.width) * 10.0) / 10.0;
    }

    private boolean validateSides(double width, double lenght) {
        if (width < 0 || lenght < 0)
            throw new IllegalArgumentException("Sides cannot be negative.");
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        rectangle rectangle = (rectangle) obj;
        return this.width == rectangle.width && this.length == rectangle.length;
    }

    @Override
    public String toString() {
        return "Rectangle with sides " + this.width + ", " + this.length + " has area "
                + this.getArea() + " and perimeter " + this.getPerimeter();
    }
}
