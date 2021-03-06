import level3.lesson7.ExecutingTest;
import level3.lesson7.TestClassWithAnnotations;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
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
//        try {
//            System.out.println("Calculated result: " + TestException.doMassWithExceptions(new String[][]{
//                    {"2","33","3","2"},
//                    {"3","23","23","23","23","23"},
//                    {"3","2","3","23"},
//                    {"4","0","3","2"}}));
//            System.out.println("Calculated result: " + TestException.doMassWithExceptions(new String[][]{
//                    {"2", "33", "3", "2"},
//                    {"3", "23", "23", "be-be"},
//                    {"3", "2", "3", "23"},
//                    {"4", "0", "3", "2"}}));
//            System.out.println("Calculated result: " + TestException.doMassWithExceptions(new String[][]{
//                    {"2", "33", "3", "2"},
//                    {"3", "23", "23", "3"},
//                    {"3", "2", "3", "23"},
//                    {"4", "0", "3", "2"}}));
//        } catch(MyArraySizeException | MyArrayDataException e){
//                e.printStackTrace();
//            }
//        }
//    }
// Lesson3
// task1
//        ArrayCollectionTest arrayCollectionTest = new ArrayCollectionTest(new String[]{"test", "test", "test2",
//                "test3", "test5", "test5", "test4", "test4", "test4", "test4"});
//        arrayCollectionTest.printUniqElements();
//        System.out.println(arrayCollectionTest.calcCountForEachElement());
// task2
//        PhoneBook phoneBook = new PhoneBook();
//
//        phoneBook.add("Sbuchelov", "+7 925 064 3983");
//        phoneBook.add("Sbuchelov", "+7 925 064 3984");
//        phoneBook.add("Sidorov", "+7 925 064 2222");
//        phoneBook.add("Petrov", "+7 925 064 3333");
//        phoneBook.add("Ivanov", "+7 925 064 4444");
//
//        String name1 = "Sbuchelov";
//        String name2 = "Petrov";
//        System.out.println(String.format("%s: %s", name1, phoneBook.getPhones(name1)));
//        System.out.println(String.format("%s: %s", name2, phoneBook.getPhones(name2)));
// Lesson 5
//        ConcurrencyTest.processingMassWithoutConcurrency();
//        ConcurrencyTest.processingMassWithConcurrency();
// Level 3
// Lesson1
// task1, task2
//        GenTest gt = new GenTest();
//        gt.printInfoArray();
//        gt.changeArrayToArrayList(gt.changePositionForArrayObj(1, 3));
//        gt.printInfoArrayList();
// task 3
//        FruitBox<Apple> appleBox = new FruitBox(new Apple());
//        FruitBox<Apple> appleBox1 = new FruitBox(new Apple());
//        FruitBox<Orange> orangeBox = new FruitBox(new Orange());
//        appleBox.putFruit(new Apple());
//        appleBox.putFruit(new Apple());
//        appleBox.putFruit(new Apple());
//        orangeBox.putFruit(new Orange());
//        orangeBox.putFruit(new Orange());
//        orangeBox.putFruit(new Orange());
//
//        System.out.println(appleBox.getWeightBox());
//        System.out.println(orangeBox.getWeightBox());
//        String value = (appleBox.compare(orangeBox)) ? "Equal boxes" : "Not equal boxes";
//        System.out.println(value);
//
//        System.out.println("````````````````````````````````````````````");
//        System.out.println("Apple box weight before moved from another fruit box: " + appleBox.getWeightBox());
//        appleBox.moveFruit(appleBox1);
//        System.out.println("Apple box weight after moved from another fruit box: " + appleBox.getWeightBox());
// Lesson5
// task1, task2, task3, task4
//        Transport bus1 = new Bus("Bus1");
//        Transport bus2 = new Bus("Bus2");
//        Transport bus3 = new Bus("Bus3");
//        Transport bus4 = new Bus("Bus4");
//        Transport car1 = new Car("Car1");
//        Transport car2 = new Car("Car2");
//        Transport truck1 = new Truck("Truck1");
//        Transport truck2 = new Truck("Truck2");
//        Transport truck3 = new Truck("Truck3");
//        List<Transport> transports = new ArrayList<>();
//        transports.add(bus1);
//        transports.add(bus2);
//        transports.add(bus3);
//        transports.add(bus4);
//        transports.add(car1);
//        transports.add(car2);
//        transports.add(truck1);
//        transports.add(truck2);
//        transports.add(truck3);
//        for (Transport transport : transports) {
//            transport.execute();
//        }
//        new FuelStation(transports).refuel();
// MD5 value for tests
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        md.update("111111".getBytes());
//
//        byte byteData[] = md.digest();
//
//        //конвертируем байт в шестнадцатеричный формат первым способом
//        StringBuffer sb = new StringBuffer();
//        for (byte aByteData : byteData) {
//            sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
//        }
//        System.out.println("Текст в шестнадцатеричном виде : " + sb.toString());
//
//        //конвертируем байт в шестнадцатеричный формат вторым способом
//        StringBuffer hexString = new StringBuffer();
//        for (byte aByteData : byteData) {
//            String hex = Integer.toHexString(0xff & aByteData);
//            if (hex.length() == 1) hexString.append('0');
//            hexString.append(hex);
//        }
//        System.out.println("Текст в шестнадцатеричном виде : " + hexString.toString());
//        TestClassWithAnnotations t = new TestClassWithAnnotations();
//        Class c = t.getClass();
// Lesson7
// task1
        ExecutingTest.start(TestClassWithAnnotations.class);
    }
}
