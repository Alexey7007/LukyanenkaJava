package course_aqa.L5.task_1;

public class Dog extends Animal {
    static int totalDog;

    public Dog(String name) {
        super(name);
        totalDog++;
    }

    @Override
    public void run(int length) {
        if (length < 0) {
            System.out.println(getName() + " не может пробежать отрицательную дистанцию.");
        }
        if (length <= 500) {
            System.out.println(getName() + " пробежал(а) " + length + " м.");
        } else {
            System.out.println(getName() + " не может пробежать " + length + " м. Максимальная дистанция 500 м.");
        }
    }

    @Override
    public void swim(int length) {
        if (length < 0) {
            System.out.println(getName() + " не может проплыть отрицательную дистанцию.");
        }
        if (length <= 10) {
            System.out.println(getName() + " проплыл " + length + " м. ");
        } else {
            System.out.println(getName() + " не может проплыть " + length + " м. Максимальная дистанция 10 м.");
        }
    }
}
