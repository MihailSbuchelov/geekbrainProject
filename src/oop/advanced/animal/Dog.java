package oop.advanced.animal;

import oop.advanced.behavior.Behaviour;
import oop.advanced.behavior.JumpBehaviour;
import oop.advanced.behavior.RunBehaviour;
import oop.advanced.behavior.SwimBehaviour;

public class Dog extends Animal {
    private Behaviour[] behaviours;

    public Dog(String name, Behaviour... behaviours) {
        super(name);
        this.behaviours = behaviours;
    }

    public Dog(String name, int jumpThreshold, int runThreshold, int swimThreshold) {
        super(name);
        behaviours = new Behaviour[]{
                new JumpBehaviour(jumpThreshold),
                new RunBehaviour(runThreshold),
                new SwimBehaviour(swimThreshold)
        };
    }

    @Override
    protected void perform(int val) {
        for (Behaviour behaviour : behaviours) {
            boolean isOK = behaviour.behave(val);
            System.out.println(String.format("%s: %s", behaviour.getClass().getSimpleName(), isOK));
        }
    }
}
