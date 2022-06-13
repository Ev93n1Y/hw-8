class ShapeUtils {
    public String showName(Shape shape) {
        return shape.getName();
    }
    public void printName(Shape shape) {
        System.out.println(showName(shape));
    }
}