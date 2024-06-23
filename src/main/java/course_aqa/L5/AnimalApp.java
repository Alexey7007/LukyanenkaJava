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

        Cat[] cats = {new Cat("Марсик"), new Cat("Катя"), new Cat("Мурка")};
        Tarelka tarelka = new Tarelka(100);

        for (Cat cat:cats){
            cat.eat(tarelka);
            System.out.println(cat.getName() + " сытость: " + cat.isSitost());
        }

        tarelka.plusFood(25);
        System.out.println("В тарелке еды осталось: " + tarelka.getFood());
    }
}