package level1.oop.advanced.behavior;

import level1.oop.advanced.container.Plate;

public class EatBehaviour extends Behaviour {
    private Plate plate;

    public EatBehaviour(int threshold, Plate plate) {
        super(threshold);
        this.plate = plate;

    }

    @Override
    protected boolean perform(int val) {
        return this.plate.eating(val);
    }
}
