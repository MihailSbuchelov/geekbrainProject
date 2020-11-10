package oop;

public class Dog extends Animal {

    public Dog(double runLim, double swimLim, double jumpLim) {
        super(runLim, swimLim, jumpLim);
    }

    @Override
    public void run(double distance) {
        if (distance > this.getRunLim()) System.out.println("run: false");
        System.out.println("run: true");
    }

    @Override
    public void swim(double distance) {
        if (distance > this.getSwimLim()) System.out.println("run: false");
        System.out.println("swim: true");
    }

    @Override
    public void jump(double height) {
        if (height > this.getJumpLim()) System.out.println("jump: false");
        System.out.println("jump: true");
    }
}
