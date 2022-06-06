public class Circle extends Shape implements Drawable{
    private double radius;
    private Color color;

    public Circle(double radius) {
        this("Circle", radius);
    }

    protected Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public void draw(Coordinates coordinates) {
        System.out.println(getName()+ " " +  this.color + " was drawn at " + coordinates);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

