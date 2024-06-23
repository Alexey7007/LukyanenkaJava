package course_aqa.L5;

public class AnimalApp {
    public static void main(String[] args) {
        Cat catBoris = new Cat("Борис");
        catBoris.run(250);
        catBoris.run(100);
        catBoris.swim(5);

        Dog dogMalish = new Dog("Малыш");
        dogMalish.run(505);
        dogMalish.run(450);
        dogMalish.swim(11);
        dogMalish.swim(10);

        Animal zebraLolli = new Animal("Лолли");
        zebraLolli.run(100);
        zebraLolli.swim(10);

    }
}
