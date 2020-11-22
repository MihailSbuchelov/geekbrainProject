package level1.oop.advanced.behavior;

public abstract class Behaviour {
    protected int threshold;

    public Behaviour(int threshold) {
        this.threshold = threshold;
    }

    protected abstract boolean perform(int val);

    public boolean behave(int val) {
        return perform(val);
    }
}
