package oop.advanced.container;

public class Plate {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Plate(int value) {
        this.value = value;
    }

    public boolean eating(int value) {
        if (value >= this.getValue()) {
            System.out.println("Meal is not more! You must add meals in the plate!");
            return false;
        } else {
            this.setValue(this.value - value);
            System.out.println(String.format("The cat ate %s meals", value));
            return true;
        }
    }

    public void addMeals(int val) {
        this.value += val;
    }

}
