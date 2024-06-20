package course_aqa.L2;

public class Task_2 {
    public static void checkSumSign(){
        int a = (int) Math.round(Math.random() * 10), b = (int) Math.round(Math.random() * 10);
        if (Math.random()>0.5){
            b= b * (-1);
        }
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
