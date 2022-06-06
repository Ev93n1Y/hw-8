class Point extends Circle implements Drawable {
    private Color color;

    public Point() {
        super("Point", 0.0);
    }

    @Override
    public void setRadius(double radius) {
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public void draw(Coordinates coordinates) {
        System.out.println(getName() + " " + this.color + " was drawn at " + coordinates);
    }
}