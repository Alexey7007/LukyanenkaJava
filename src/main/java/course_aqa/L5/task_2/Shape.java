package course_aqa.L5.task_2;

public interface Shape {
    double area();
    double perimetr();

    default double rashetPerimetr(){
        return perimetr();
    }

    String getFillColor();
    String getBorderColor();
}
