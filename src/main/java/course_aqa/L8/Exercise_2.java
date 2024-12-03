package course_aqa.L8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise_2 {
    private Map<String, List<String>> directory = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory.containsKey(surname)) {
            phone_number_list = directory.get(surname);
        } else {
            phone_number_list = new ArrayList<>();
        }
        phone_number_list.add(phone_number);
        directory.put(surname, phone_number_list);
    }

    public List<String> get(String surname) {
        return directory.get(surname);
    }

    public static void main(String[] args) {
        Exercise_2 phoneNumberDirectory = new Exercise_2();

        phoneNumberDirectory.add("Лукьяненко", "80440001234");
        phoneNumberDirectory.add("Баранов", "80339445612");
        phoneNumberDirectory.add("Петров", "80444205434");
        phoneNumberDirectory.add("Калужный", "80294501234");
        phoneNumberDirectory.add("Лукьяненко", "80441234000");
        phoneNumberDirectory.add("Кондратьев", "80449484651");
        phoneNumberDirectory.add("Лукьяненко", "80440123400");
        phoneNumberDirectory.add("Кондратьев", "80294578321");
        phoneNumberDirectory.add("Служба спасения", "911");

        System.out.println(phoneNumberDirectory.get("Лукьяненко"));
        System.out.println(phoneNumberDirectory.get("Служба спасения"));
        System.out.println(phoneNumberDirectory.get("Баранов"));
        System.out.println(phoneNumberDirectory.get("Кондратьев"));
    }
}
