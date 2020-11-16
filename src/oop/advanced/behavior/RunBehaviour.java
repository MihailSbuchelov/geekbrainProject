package oop.advanced.behavior;

public class RunBehaviour extends Behaviour {
    public RunBehaviour(int threshold) {
        super(threshold);
    }

    @Override
    protected boolean perform(int val) {
        return val <= threshold;
    }
}
