package course_aqa.L2;

import java.util.Random;

public class Task_3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void printColor() {
        Random rand = new Random();
        int value = rand.nextInt(301) - 100;
        if (value <= 0) {
            System.out.println(ANSI_RED + "Красный" + ANSI_RESET);
        }
        if (value > 0 && value <= 100) {
            System.out.println(ANSI_YELLOW + "Желтый" + ANSI_RESET);
        }
        if (value > 100) {
            System.out.println(ANSI_GREEN + "Зеленый" + ANSI_RESET);
        }
    }
}
