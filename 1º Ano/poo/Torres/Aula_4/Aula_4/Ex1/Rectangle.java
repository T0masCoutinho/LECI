package Aula_4.Ex1;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (validateSides(width, height)) {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Rectangle rectangle = (Rectangle) obj;
        return this.width == rectangle.width && this.height == rectangle.height;
    }

    public double getArea() {
        return (this.width * this.height * 10.0) / 10.0;
    }

    public double getPerimeter() {
        return (2 * (this.width + this.height) * 10.0) / 10.0;
    }

    @Override

    public String toString() {
        return "Rectangle with width " + this.width + " and height " + this.height + " has area " + this.getArea()
                + " and perimeter " + this.getPerimeter();
    }

    private boolean validateSides(double width, double height) {
        if (width < 0)
            throw new IllegalArgumentException("Width cannot be negative.");
        if (height < 0)
            throw new IllegalArgumentException("Height cannot be negative.");
        return true;
    }
}
