package oop.advanced.behavior;

public class SwimBehaviour extends Behaviour {
    public SwimBehaviour(int threshold) {
        super(threshold);
    }

    @Override
    protected boolean perform(int val) {
        return val <= threshold;
    }
}
