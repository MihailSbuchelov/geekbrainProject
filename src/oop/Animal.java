package oop;

public abstract class Animal {
    double runLim;
    double swimLim;
    double jumpLim;

    public Animal(double runLim, double swimLim, double jumpLim) {
        this.runLim = runLim;
        this.swimLim = swimLim;
        this.jumpLim = jumpLim;
    }

    public abstract void run(double distance);

    public abstract void swim(double distance);

    public abstract void jump(double height);
}