package oop;

public abstract class Animal {

    private double runLim;
    private double swimLim;
    private double jumpLim;

    public Animal(double runLim, double swimLim, double jumpLim) {
        this.runLim = runLim;
        this.swimLim = swimLim;
        this.jumpLim = jumpLim;
    }

    public double getRunLim() {
        return runLim;
    }

    public double getSwimLim() {
        return swimLim;
    }

    public double getJumpLim() {
        return jumpLim;
    }

    public abstract void run(double distance);

    public abstract void swim(double distance);

    public abstract void jump(double height);
}