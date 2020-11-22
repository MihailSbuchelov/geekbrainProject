import level1.oop.Dog;
import level2.lesson1.barriers.Course;
import level2.lesson1.barriers.Track;
import level2.lesson1.barriers.Wall;
import level2.lesson1.behavior.BarrierBehavior;
import level2.lesson1.behavior.SportBehavior;
import level2.lesson1.sportsmen.Cat;
import level2.lesson1.sportsmen.Man;
import level2.lesson1.sportsmen.Robot;
import level2.lesson1.sportsmen.Team;
import level2.lesson2.MyArrayDataException;
import level2.lesson2.MyArraySizeException;
import level2.lesson2.TestException;

public class Main {

    public static void main(String[] args) {
// Level 1
// Lesson 1
//        boolean b = true;
//        int i = 33;
//        long l = 12344l;
//        float f = 123213.123f;
//        double d = 1232.25656d;
//        String s = "это строка";
//
//        Lesson1.calcExpresion(1.222f, 2.2f, 3.33f, 0.0f);
//        Lesson1.calcExpresion(1.222f, 2.2f, 3.33f, 1.0f);
//        Lesson1.comparingSumWithLim(2, 19);
//        Lesson1.printSignNum(-200);
//        Lesson1.returnTrueForNegativeNum(-32);
//        Lesson1.printName("Mike");
//        Lesson1.countingBissextileOrNot(2020);

// Lesson 2
//        Lesson2 less2 = new Lesson2();
//        less2.changePlaceForMassTask1();
//        less2.changeValForMassTask3();
//        Lesson2.minMaxValTask5(less2.getMassTask3());
//        Lesson2.checkBalanceTask6(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
//        Lesson2.checkBalanceTask6(new int[]{1, 1, 1, 2, 1});
//        Lesson2.replaceMassElementsTask7(new int[]{1,2,3,4,5},2);
//        Lesson2.replaceMassElementsTask7(new int[]{1,2,3,4,5},-2);

// Lesson3
//        Lesson3 lesson3 = new Lesson3();
//
//        Lesson 5
//        Employee[] employees = new Employee[5];
//        employees[0] = new Employee("Vasya Petrov", "manager1", "qaz@ya.ru", "+79250009925", 250.45, 99 );
//        employees[1] = new Employee("Petya Vasichkin", "manager2", "qwerty@ya.ru", "+79250009931", 310.12, 31);
//        employees[2] = new Employee("Alla Petrova", "counter", "qsx@ya.ru", "+79250009933", 330.0, 33);
//        employees[3] = new Employee("Polikarp Zaslavskiy", "director", "zxc@ya.ru", "+79250009945", 450.03, 45);
//        employees[4] = new Employee("Kolya Galkin", "waiter", "dsfdsf@ya.ru", "+79250009919", 190.01, 19);
//
//        for (Employee i : employees) {
//            if (i.getAge() > 40) i.printInfoAboutEmployee();
//        }
// Lesson6
//        Dog dog1 = new Dog(500, 10, 0.5);
//        dog1.run(120);
//        Cat cat1 = new Cat(200, 2);
//        cat1.swim(30);
//        cat1.jump(2);

// Level 2
// Lesson1
//        BarrierBehavior[] barrierBehaviors = new BarrierBehavior[]{
//                new Wall(55),
//                new Track(101),
//                new Wall(200)};
//        Team team = new Team("dreamTeam", new SportBehavior[]{
//                new Robot("Robot1", 100, 56),
//                new Man("Man1", 500, 201),
//                new Cat("Cat1", 56, 300)});
//        new Course(barrierBehaviors).dolt(team);
//        team.showInfoTeam();
//        team.showResult();
// Lesson2
        try {
            System.out.println("Calculated result: " + TestException.doMassWithExceptions(new String[]{"2", "be-be", "3", "4"}));
//            System.out.println("Calculated result: " + TestException.doMassWithExceptions(new String[]{"2", "33", "3", "4"}));
//            System.out.println("Calculated result: " + TestException.doMassWithExceptions(new String[]{"2", "3", "3", "4","23"}));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
