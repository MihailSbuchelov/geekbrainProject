import lessons.Lesson1;
import lessons.Lesson2;
import lessons.Lesson3;
import oop.Cat;
import oop.Dog;
import oop.Employee;

public class Main {

    public static void main(String[] args) {

//Lesson 1
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

//        Lesson3
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
//        Lesson6
        Dog dog1 = new Dog(500, 10, 0.5);
        dog1.run(120);
        Cat cat1 = new Cat(200, 2);
        cat1.swim(30);
    }

}
