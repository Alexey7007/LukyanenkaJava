package course_aqa.L5.task_1;

public class Cat extends Animal{
    private String name;
    private boolean sitost;
    static int totalCat;
    public Cat(String name){
        this.name = name;
        this.sitost = false;
        totalCat++;
    }

    public boolean isSitost() {
        return sitost;
    }

    public String getName() {
        return name;
    }

    public void eat(Tarelka tarelka) {
        if (tarelka.minusFood(40)){
            sitost = true;
        }
    }

    @Override
    public void run(int length){
        if (length <=200){
            System.out.println(name + " пробежал(а) " + length + " м.");
        }
        else {
            System.out.println(name + " не может пробежать " + length + " м. Максимальная дистанция 200 м.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(name + " кот (кошка) и не умеет плавать.");
    }
}