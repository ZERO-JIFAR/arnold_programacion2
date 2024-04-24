package tp1.ejer09;

public class Rectangle extends GeometricFigure{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    double area() {
        return (length*width);
    }
    @Override
    double perimeter() {
        return ((2*length)+(2*width));
    }
}
