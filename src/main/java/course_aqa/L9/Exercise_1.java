package course_aqa.L9;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercise_1 {
    public static void main(String[] args) {
// Генерация случайного набора чисел (20 случайных чисел от 1 до 100)
        List<Integer> randomNumbers = new Random().ints(20, 1, 100)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Сгенерированные числа: " + randomNumbers);

// Подсчёт количества чётных чисел
        long evenNumbers = randomNumbers.stream()
                .filter(num -> num % 2 == 0)
                .count();

        System.out.println("Количество чётных чисел: " + evenNumbers);
    }
}
