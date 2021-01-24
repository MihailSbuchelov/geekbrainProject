package level1.oop.advanced.animal;

import level1.oop.advanced.behavior.Behaviour;
import level1.oop.advanced.behavior.JumpBehaviour;
import level1.oop.advanced.behavior.RunBehaviour;
import level1.oop.advanced.behavior.SwimBehaviour;

public class Dog extends Animal {
    private Behaviour[] behaviours;
    StringBuilder stringBuilder;

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
