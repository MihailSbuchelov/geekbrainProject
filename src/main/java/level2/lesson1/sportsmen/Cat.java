package level2.lesson1.sportsmen;

import level2.lesson1.behavior.SportBehavior;

public class Cat implements SportBehavior {
    private String name;
    private int thresholdRun;
    private int thresholdJump;
    private boolean winFlag = true;

    public Cat(String name, int thresholdRun, int thresholdJump) {
        this.name = name;
        this.thresholdJump = thresholdJump;
        this.thresholdRun = thresholdRun;
    }

    @Override
    public boolean run(double value) {
        if (value > this.thresholdRun) {
            System.out.println("run " + this.name + " is bad");
            winFlag = false;
            return false;
        } else {
            System.out.println("run " + this.name + " is good");
            return true;
        }
    }

    @Override
    public boolean jump(double val) {
        if (val > this.thresholdJump) {
            System.out.println("jump " + this.name + " is bad");
            winFlag = false;
            return false;
        } else {
            System.out.println("jump " + this.name + " is good");
            return true;
        }

    }

    @Override
    public boolean getWinFlag() {
        return this.winFlag;
    }

    @Override
    public String toString() {
        return "Team member: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThresholdRun() {
        return thresholdRun;
    }

    public void setThresholdRun(int thresholdRun) {
        this.thresholdRun = thresholdRun;
    }

    public int getThresholdJump() {
        return thresholdJump;
    }

    public void setThresholdJump(int thresholdJump) {
        this.thresholdJump = thresholdJump;
    }
}