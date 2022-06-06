public class Line extends Shape implements Drawable{
    private double length;
    private Color color;

    public Line(double length) {
        super("Line");
        this.length = length;
    }
    @Override
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public void draw(Coordinates coordinates) {
        System.out.println(getName()+ " " +  this.color + " was drawn at " + coordinates);
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}