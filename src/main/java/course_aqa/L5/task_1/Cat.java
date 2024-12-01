package course_aqa.L5.task_1;

public class Cat extends Animal{
    private boolean satiety;
    static int totalCat;
    public Cat(String name){
        super(name);
        this.satiety = false;
        totalCat++;
    }

    public boolean isSatiety() {
        return satiety;
    }



    public void eat(Tarelka tarelka) {
        if (tarelka.minusFood(40)){
            satiety = true;
        }
    }

    @Override
    public void run(int length){
        if (length < 0) {
            System.out.println(getName() + " не может пробежать отрицательную дистанцию.");
        }
        if (length <=200){
            System.out.println(getName() + " пробежал(а) " + length + " м.");
        }
        else {
            System.out.println(getName() + " не может пробежать " + length + " м. Максимальная дистанция 200 м.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(getName() + " кот (кошка) и не умеет плавать.");
    }
}