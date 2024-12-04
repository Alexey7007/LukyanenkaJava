package course_aqa.L9;

import java.util.Arrays;
import java.util.List;

public class Exercise_2 {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");

// 2.1 Посчитать, сколько раз объект «High» встречается в коллекции
        long countHigh = collection.stream()
                .filter("High"::equals)
                .count();
        System.out.println("Количество 'High': " + countHigh);

// 2.2 Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0
        String firstElement = collection.stream()
                .findFirst()
                .orElse("0");
        System.out.println("Первый элемент: " + firstElement);

// 2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0;
        String lastElement = collection.stream()
                .reduce((first, second) -> second)
                .orElse("0");
        System.out.println("Последний элемент: " + lastElement);
    }
}
