package shapes;

public class Rectangle implements Shape {

    private double a;
    private double b;
    private String fillColor;
    private String borderColor;

    public Rectangle(double a, double b, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}