package course_aqa.L4;

public class Worker {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;


    public Worker(String fullName, String position, String email, String phoneNumber, double
            salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void vivod_ifo(){
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("Петр Петрович Петров", "ИО Директор", "petrov@pet.rov", "+375441234567", 100.0, 34);
        worker1.vivod_ifo();
    }

}
