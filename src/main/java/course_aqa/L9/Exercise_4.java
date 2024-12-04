package course_aqa.L9;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exercise_4 {
    private static class Student {
        String name;
        int age;
        String gender;

        Student(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return name + " (" + age + " лет)";
        }
    }


    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Леша", 26, "муж"),
                new Student("Олег", 29, "муж"),
                new Student("Захар", 19, "муж"),
                new Student("Диана", 27, "жен"),
                new Student("Юля", 18, "жен"),
                new Student("Петя", 17, "муж")
        );

// 4.1. Узнать средний возраст студентов мужского пола
        OptionalDouble averageMaleAge = students.stream()
                .filter(student -> "муж".equals(student.getGender()))
                .mapToInt(Student::getAge)
                .average();

        System.out.println("Средний возраст студентов мужского пола: " + averageMaleAge.getAsDouble());

// 4.2. Кому из студентов грозит получение повестки в этом году
        List<Student> draftEligibleStudents = students.stream()
                .filter(student -> "муж".equals(student.getGender()))
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27)
                .collect(Collectors.toList());

        System.out.println("Студенты, которым грозит получение повестки: " + draftEligibleStudents);
    }
}

