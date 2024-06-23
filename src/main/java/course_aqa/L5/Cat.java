package course_aqa.L5;

public class Cat extends Animal{
    private String name;
    static int totalCat;
    public Cat(String name){
        this.name = name;
        totalCat++;
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

