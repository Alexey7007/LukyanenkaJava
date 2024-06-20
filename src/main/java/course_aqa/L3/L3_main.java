package course_aqa.L3;

import java.util.Random;

public class L3_main {
    public static boolean method_1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void method_2(int a) {
        if (a >= 0) {
            System.out.println(a + ": число положительное.");
        } else {
            System.out.println(a + ": число отрицательное.");
        }
    }

    public static boolean method_3(int a) {
        if (a > 0) {
            return false;
        } else return true;
    }

    public static void method_4(String str, int x) {
        while (x > 0) {
            System.out.println(str);
            x--;
        }
    }

    public static boolean method_5(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int[] method_6_generate() {
        Random rand = new Random();
        int[] numbers = new int[7];
        int numbersLength = numbers.length;
        for (int i = 0; i < numbersLength; i++) {
            numbers[i] = rand.nextInt(2);
        }
        return numbers;
    }

    public static void method_6_vivod(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static int[] method_6_zamena(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else numbers[i] = 0;
        }
        return numbers;
    }

    public static void method_7() {
        int[] numbers = new int[100];
        int numbersLength = numbers.length;
        for (int i = 0; i < numbersLength; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void method_8() {
        int[] numbers = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int numbersLength = numbers.length;
        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void method_9() {
        int size = 5;
        int[][] аrray = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    аrray[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(аrray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] method_10(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }



    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Задание №1");
        System.out.println(method_1(rand.nextInt(10), rand.nextInt(10)));

        System.out.println("Задание №2");
        method_2(rand.nextInt(201) - 100);

        System.out.println("Задание №3");
        System.out.println(method_3(rand.nextInt(21) - 10));

        System.out.println("Задание №4");
        method_4("string", rand.nextInt(11));

        System.out.println("Задание №5");
        System.out.println(method_5(2025));
        System.out.println(method_5(2024));
        System.out.println(method_5(2023));
        System.out.println(method_5(2000));
        System.out.println(method_5(2100));

        System.out.println("Задание №6");
        int[] m6 = method_6_generate();
        method_6_vivod(m6);
        method_6_vivod(method_6_zamena(m6));

        System.out.println("Задание №7");
        method_7();

        System.out.println("Задание №8");
        method_8();

        System.out.println("Задание №9");
        method_9();

        System.out.println("Задание №10");
        method_6_vivod(method_10(rand.nextInt(10), rand.nextInt(10)));
    }
}
