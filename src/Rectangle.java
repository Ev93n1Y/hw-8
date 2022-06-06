public class Rectangle extends Shape implements Drawable {
    private double width;
    private double length;
    private Color color;

    public Rectangle(double side) {
        this("Quard", side, side);
    }

    public Rectangle(double length, double width) {
        this("Rectangle", length, width);
    }

    private Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public void draw(Coordinates coordinates) {
        System.out.println(getName()+ " " +  this.color + " was drawn at " + coordinates);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}