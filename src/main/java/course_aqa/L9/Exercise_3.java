package course_aqa.L9;

import java.util.Arrays;
import java.util.List;

public class Exercise_3 {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("f10", "f15", "f2", "f4", "f4");

        String[] sortedArray = collection.stream()
                .sorted()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(sortedArray));
    }
}
