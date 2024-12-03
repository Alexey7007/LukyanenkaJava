package course_aqa.L8;

import java.util.*;

public class Exercise_1 {
    public static void main(String[] args) {

        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "kiwi", "grape", "kiwi", "banana", "melon", "melon", "melon", "kiwi", "orange", "apple", "grape", "banana", "mango"};

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова: " + wordCount.keySet());

        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
