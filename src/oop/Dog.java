package oop;

public class Dog extends Animal {

    public Dog(double runLim, double swimLim, double jumpLim) {
        super(runLim, swimLim, jumpLim);
    }

    @Override
    public void run(double distance) {
        if (distance > this.runLim) System.out.println("run: false");
        System.out.println("run: true");
    }

    @Override
    public void swim(double distance) {
        if (distance > this.swimLim) System.out.println("run: false");
        System.out.println("swim: true");
    }

    @Override
    public void jump(double height) {
        if (height > this.jumpLim) System.out.println("jump: false");
        System.out.println("jump: true");
    }
}
