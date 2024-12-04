package course_aqa.L9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> logins = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            logins.add(input);
        }

        List<String> filteredLogins = logins.stream()
                .filter(login -> login.startsWith("f"))
                .collect(Collectors.toList());

        filteredLogins.forEach(System.out::println);
    }
}
