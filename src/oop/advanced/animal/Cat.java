package oop.advanced.animal;

import oop.advanced.behavior.Behaviour;
import oop.advanced.behavior.EatBehaviour;
import oop.advanced.behavior.JumpBehaviour;
import oop.advanced.behavior.RunBehaviour;
import oop.advanced.container.Plate;

public class Cat extends Animal {
    private Behaviour jumpBehaviour;
    private Behaviour runBehaviour;
    private Behaviour eatBehaviour;
    private boolean full = false;


    public Cat(String name, int eatBehaviourVal, Plate plate) {
        super(name);
        eatBehaviour = new EatBehaviour(eatBehaviourVal, plate);
        System.out.println(String.format("Full: %s", full));
    }


    public Cat(String name, int jumpThreshold, int runThreshold, int eatBehaviourVal, Plate plate) {
        super(name);
        jumpBehaviour = new JumpBehaviour(jumpThreshold);
        runBehaviour = new RunBehaviour(runThreshold);
        eatBehaviour = new EatBehaviour(eatBehaviourVal, plate);
        System.out.println(String.format("Full: %s", full));
    }

    @Override
    protected void perform(int val) {
        boolean isJumpOk = jumpBehaviour.behave(val);
        System.out.println(String.format("Jump: %s", isJumpOk));
        boolean isRunOk = runBehaviour.behave(val);
        System.out.println(String.format("Run: %s", isRunOk));
        if (eatBehaviour.behave(val)) full = true;
        System.out.println(String.format("Full: %s", full));
    }
}
