public class Triangle extends Shape implements Drawable {
    private double a, b, c;
    private Color color;

    public Triangle(double side) {
        this("Equilateral triangle", side, side, side);
    }

    public Triangle(double a, double b, double c) {
        this("Triangle", a, b, c);
    }

    private Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public void draw(Coordinates coordinates) {
        System.out.println(getName()+ " " +  this.color + " was drawn at " + coordinates);
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}