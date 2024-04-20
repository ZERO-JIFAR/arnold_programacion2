package ejer09;

public class Circle extends GeometricFigure {
    private double radio;
    public Circle (double radio){
        this.radio = radio;
    }

    public double getRedio() {
        return radio;
    }

    public void setRedio(double redio) {
        this.radio = redio;
    }
    @Override
    double area(){
        return (Math.PI*radio*radio);
    }
    @Override
    double perimeter(){
        return (2*Math.PI*radio);
    }
}
