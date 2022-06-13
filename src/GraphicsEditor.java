public class GraphicsEditor {
    public static void main(String[] args) {
        Line line = new Line(10);
        Point point = new Point();
        Circle circle = new Circle(2);
        Triangle equilateralTriangle = new Triangle(5.5);
        Triangle triangle = new Triangle(1, 3, 5);
        Rectangle quard = new Rectangle(1);
        Rectangle rectangle = new Rectangle(2.3, 5);

        ShapeUtils shapeUtils = new ShapeUtils();

        shapeUtils.printName(circle);
        //System.out.println(shapeUtils.showName(rectangle));


        line.setColor(new Color(250,250,250));
        point.setColor(new Color(22,25,198));
        circle.setColor(new Color(20,50,2));
        equilateralTriangle.setColor(new Color(0,2,145));
        triangle.setColor(new Color(222,14,101));
        quard.setColor(new Color(244,244,244));
        rectangle.setColor(new Color(50,50,50));

        line.draw(new Coordinates(1.3,2.3));
        point.draw(new Coordinates(1.8,3.5));
        circle.draw(new Coordinates(4,4));
        equilateralTriangle.draw(new Coordinates(2,3));
        triangle.draw(new Coordinates(1.8,0.4));
        quard.draw(new Coordinates(-1,-1));
        rectangle.draw(new Coordinates(5,4));

    }
}

/*
Домашнее задание
Ты делаешь графический редактор.

Продумай иерархию классов. Здесь должны быть как минимум:

базовый класс для фигуры Shape. Этот класс должен иметь метод для вывода имени фигуры.
классы-наследники - Circle, Quad и т.д. - не меньше 5 вариантов;
должен быть класс, который принимает фигуру, и выводит ее название. Класс должен работать именно с базовым классов Shape.
Обрати внимание на использование интерфейсов, абстрактных классов, модификаторов доступа.

Нет единого правильного способа решения этой задачи. Попытайся спроектировать гибкую архитектуру, задавая себе вопросы вида
        "А что будет, если этот класс нужно будет менять? Что еще поменяется, если здесь нужно будет расширить?".
*/