package course_aqa.L5.task_2;

import course_aqa.L5.task_2.Interface.AreaCalculation;
import course_aqa.L5.task_2.Interface.Colors;
import course_aqa.L5.task_2.Interface.PerimetrCalculation;

public class mainProgram {
    public static void main(String[] args) {
        Circle circle = new Circle(6, "Зеленый", "Черный");
        Rectangle rectangle = new Rectangle(2, 5, "Красный", "Синий");
        Triangle triangle = new Triangle(10, 10, 10, "Зеленый", "Желтый");

        print(circle);
        print(rectangle);
        print(triangle);
    }

    private static void print(Colors colors) {
        if (colors instanceof AreaCalculation && colors instanceof PerimetrCalculation) {
            AreaCalculation area = (AreaCalculation) colors;
            PerimetrCalculation perimetr = (PerimetrCalculation) colors;

            System.out.println("Периметр: " + perimetr.ResultCalculationPerimetr());
            System.out.println("Площадь: " + area.ResultCalculationArea());
            System.out.println("Цвет заливки: " + colors.getFillColor());
            System.out.println("Цвет границы: " + colors.getBorderColor());
            System.out.println();
        } else {
            System.out.println("Объект не реализует необходимые интерфейсы.");
        }
    }
}
