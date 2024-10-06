package course_aqa.L5.task_2;

public class mainProgram {
    public static void main(String[] args) {
        Shape circle = new Circle(6, "Зеленый", "Черный");
        Shape rectangle = new Rectangle(2, 5, "Красный", "Синий");
        Shape triangle = new Triangle(10, 10, 10, "Зеленый", "Желтый");

        print(circle);
        print(rectangle);
        print(triangle);
    }

    private  static void print(Shape shape){
        System.out.println("Периметр: " + shape.rashetPerimetr());
        System.out.println("Площадь: " + shape.area());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getFillColor());
        System.out.println();
    }
}
