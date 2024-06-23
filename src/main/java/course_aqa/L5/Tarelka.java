package course_aqa.L5;

public class Tarelka {
    private int food;

    public Tarelka(int food) {
        this.food = food;
    }

    public boolean minusFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void plusFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }
}
