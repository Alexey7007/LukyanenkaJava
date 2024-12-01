package course_aqa.L5.task_2;

import course_aqa.L5.task_2.Interface.AreaCalculation;
import course_aqa.L5.task_2.Interface.Colors;
import course_aqa.L5.task_2.Interface.PerimetrCalculation;

public class Circle implements AreaCalculation, PerimetrCalculation, Colors {

    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor){
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double ResultCalculationArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double ResultCalculationPerimetr() {
        return 2 * Math.PI * radius;
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
