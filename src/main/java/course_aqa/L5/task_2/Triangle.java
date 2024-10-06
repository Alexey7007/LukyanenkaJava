package course_aqa.L5.task_2;

public class Triangle implements Shape{
    private double A;
    private double B;
    private double C;
    private String fillColor;
    private String borderColor;

    public Triangle(double A, double B, double C, String fillColor, String borderColor){
        this.A = A;
        this.B = B;
        this.C = C;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        double s = (A + B + C) / 2;
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    @Override
    public double perimetr() {
        return A + B + C;
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
