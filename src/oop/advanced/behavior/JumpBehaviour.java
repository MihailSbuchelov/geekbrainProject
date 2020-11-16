package oop.advanced.behavior;

public class JumpBehaviour extends Behaviour {
    public JumpBehaviour(int threshold) {
        super(threshold);
    }

    @Override
    protected boolean perform(int val) {
        return val <= threshold;
    }
}
