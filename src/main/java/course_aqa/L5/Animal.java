package course_aqa.L5;

public class Animal {
    static int totalAnimals = 0;
    private String name;
    public Animal(){
    }
    public Animal(String name){
        this.name = name;
        totalAnimals++;
    }

    public void run(int length){
        System.out.println(name + " пробежал(а) " + length);
    }

    public void swim(int length){
        System.out.println(name + " проплыл(а) " + length);
    }
}
