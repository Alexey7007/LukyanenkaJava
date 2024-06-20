package old;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.print("Выберите необходимое задание и введите соответствующую цифру в консоль:\n" + "1 - Первое задание\n" + "2 - Второе задание\n" + "3 - Третье задание\n" + "0 - Выход\n" + "");
            int pressNumber = sc.nextInt();
            switch (pressNumber) {
                case 1:
                    System.out.println("Первое задание \n" + "Введите число: ");
                    int pressNumber1 = sc.nextInt();
                    task1(pressNumber1);
                    break;
                case 2:
                    System.out.println("Второе задание \n" + "Введите имя: ");
                    String name = sc.next();
                    task2(name);
                    break;
                case 3:
                    System.out.println("Третье задание \n" + "Введите длину массива: ");
                    int longMass = sc.nextInt();
                    task3(longMass);
                    break;
                case 0:
                    repeat = false;
                    break;
            }
        }
    }

    /*Составить алгоритм: если введенное число больше 7, то вывести “Привет”*/
    static void task1(int number) {
        if (number > 7) {
            String word = "Привет";
            System.out.println(word);
        }
    }

    /*Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"*/
    static void task2(String name) {
        String trueName = "Вячеслав";
        if (name.equals(trueName)) {
            System.out.println("Привет, Вячеслав");
        } else System.out.println("Нет такого имени");
    }

    /*Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3*/
    static void task3(int longMas) {
        Random random = new Random();
        int[] array = new int[longMas];
        for (int i = 0; i < longMas; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println("Получившийся массив:");
        for (int i = 0; i < longMas; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы массива кратные 3:");
        for (int i = 0; i < longMas; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}