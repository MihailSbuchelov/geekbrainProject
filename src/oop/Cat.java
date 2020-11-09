package oop;

public class Cat extends Animal {

    public Cat(double runLim, double jumpLim) {
        super(runLim, 0.0, jumpLim);
    }

    @Override
    public void run(double distance) {
        if (distance > this.runLim) System.out.println("run: false");
        System.out.println("run: true");
    }

    @Override
    public void swim(double distance) {
        System.out.println("swim: false");
    }

    @Override
    public void jump(double height) {
        if (height > this.swimLim) System.out.println("jump: false");
        System.out.println("jump: true");
    }
}
