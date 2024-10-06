package course_aqa.L5.task_1;

public class Dog extends Animal{
    String name;
    static int totalDog;
    public Dog(String name){
        this.name = name;
        totalDog++;
    }

    @Override
    public void run(int length){
        if (length <=500){
            System.out.println(name + " пробежал(а) " + length + " м.");
        }
        else {
            System.out.println(name + " не может пробежать " + length + " м. Максимальная дистанция 500 м.");
        }
    }

    @Override
    public void swim(int length){
        if (length <= 10){
            System.out.println(name + " проплыл " + length + " м. ");
        } else {
            System.out.println(name + " не может проплыть " + length + " м. Максимальная дистанция 10 м.");
        }
    }
}
