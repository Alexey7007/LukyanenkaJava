package course_aqa.L10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        if (fruits.get(0) instanceof Apple) {
            return fruits.size() * 1.0f;
        } else if (fruits.get(0) instanceof Orange) {
            return fruits.size() * 1.5f;
        }
        return 0.0f;
    }

    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void transferFruitsTo(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
