package course_aqa.L4;

public class Worker {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final double salary;
    private final int age;


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
        Worker worker1 = new Worker("Петр Петрович Петров",
                "ИО Директор", "petrov@pet.rov",
                "+375441234567", 100.0, 34);
        worker1.vivod_ifo();
        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Александр Владимирович Иванов", "Руководитель отдела маркетинга", "a.v.ivanov@marketingpro.ru", "+7 912 345-67-89", 120.0, 38);
        workerArray[1] = new Worker("Мария Александровна Семенова", "Главный бухгалтер", "m.a.semenova@financesolutions.ru", "+7 916 234-56-78", 150.0, 42);
        workerArray[2] = new Worker("Игорь Олегович Николаев", "IT-специалист", "i.o.nikolaev@techcorp.ru", "+7 903 456-78-90", 110.0, 35);
        workerArray[3] = new Worker("Елена Викторовна Петрова", "Директор по развитию", "e.v.petrova@businessgrowth.ru", "+7 925 678-90-12", 200.0, 40);
        workerArray[4] = new Worker("Виктор Анатольевич Сергеев", "Старший юрист", "v.a.sergeev@legalpro.ru", "+7 926 789-01-23", 140.0, 45);

        for (int i = 0; i < workerArray.length; i++){
            if (workerArray[i].age >= 40){
                System.out.println();
                System.out.println("ФИО: " + workerArray[i].fullName);
                System.out.println("Должность: " + workerArray[i].position);
                System.out.println("Email: " + workerArray[i].email);
                System.out.println("Телефон: " + workerArray[i].phoneNumber);
                System.out.println("Зарплата: " + workerArray[i].salary);
                System.out.println("Возраст: " + workerArray[i].age);
            }
        }
    }
}
