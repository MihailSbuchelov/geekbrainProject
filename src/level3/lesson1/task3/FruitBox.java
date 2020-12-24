package level3.lesson1.task3;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private List<T> box = new ArrayList<>();
    private T fruitType;

    public FruitBox(T fruit) {
        this.fruitType = fruit;
        this.putFruit(fruit);
    }

    public List<T> getBox() {
        return box;
    }

    public List<T> putFruit(T fruitElement) {
        box.add(fruitElement);
        return box;
    }

    public void moveFruit(FruitBox<T> fruitForMove) {
        box.addAll(fruitForMove.getBox());
        fruitForMove.getBox().clear();
    }

    public float getWeightBox() {
        return this.fruitType.getWeightFruit() * box.size();
    }

    public boolean compare(FruitBox<?> anotherFruitBox) {
        return this.getWeightBox() == anotherFruitBox.getWeightBox();
    }
}
