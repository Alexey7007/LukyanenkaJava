package course_aqa.L2;

import java.util.Random;

public class Task_4 {
    public static void compareNumbers() {
        Random rand = new Random();
        int a = rand.nextInt(11), b = rand.nextInt(11);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
