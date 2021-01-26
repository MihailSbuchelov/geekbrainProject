package level1.oop.advanced;

import level1.oop.advanced.animal.Animal;
import level1.oop.advanced.animal.Dog;
import level1.oop.advanced.behavior.JumpBehaviour;
import level1.oop.advanced.behavior.RunBehaviour;
import level1.oop.advanced.behavior.SwimBehaviour;
import level1.oop.advanced.container.Plate;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Behaviour[] behaviours = {
//                new RunBehaviour(50),
//                new SwimBehaviour(100),
//                new JumpBehaviour(55)
//        };
//
//        for (Behaviour behaviour : behaviours) {
//            behaviour.behave(60);
//        }

        Plate plate = new Plate(750);
        Animal[] animals = {
//                new Cat("Kitty", 100, 200, 20, plate),
//                new Cat("Kitty Kat", 80, 150, 20, plate),
                new Dog("Doggy", new JumpBehaviour(50), new RunBehaviour(250), new SwimBehaviour(50)),
        };

        for (Animal animal : animals) {
            animal.doActions(new Random().nextInt(400));
        }
    }
}
