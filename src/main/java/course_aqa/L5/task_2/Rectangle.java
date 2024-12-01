package course_aqa.L5.task_2;

import course_aqa.L5.task_2.Interface.AreaCalculation;
import course_aqa.L5.task_2.Interface.Colors;
import course_aqa.L5.task_2.Interface.PerimetrCalculation;

public class Rectangle implements AreaCalculation, PerimetrCalculation, Colors {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double ResultCalculationArea() {
        return width * height;
    }

    @Override
    public double ResultCalculationPerimetr() {
        return width + width + height + height;
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
