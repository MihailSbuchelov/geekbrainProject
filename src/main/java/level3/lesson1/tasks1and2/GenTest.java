package level3.lesson1.tasks1and2;

import java.util.*;

public class GenTest {

    private List mass = new ArrayList();
    private Object[] mass2 = new Object[3];


    public GenTest() {
        Test o1 = new Test("Miha");
        Test o2 = new Test("Vanya");
        Test o3 = new Test("Peaty");
        mass2[0] = o1;
        mass2[1] = o2;
        mass2[2] = o3;
    }

    public Object[] changePositionForArrayObj(int firstIndex, int secondIndex) {
        Object firstObj = mass2[firstIndex - 1];
        mass2[firstIndex - 1] = mass2[secondIndex - 1];
        mass2[secondIndex - 1] = firstObj;
        return mass2;
    }

    public List<?> changeArrayToArrayList(Object[] massVal) {
        mass = Arrays.asList(massVal);
        return mass;
    }

    public <E> List<E> changePositionForArrayList(int firstIndex, int secondIndex) {
        E firstElement = (E) mass.get(firstIndex - 1);
        mass.set(firstIndex - 1, (E) mass.get(secondIndex - 1));
        mass.set(secondIndex - 1, firstElement);
        return mass;
    }

    public void printInfoArrayList() {
        System.out.println("ArrayList:");
        System.out.println("``````````");
        for (int i = 0; i < mass.size(); i++) {
            System.out.println(mass.get(i).toString());
        }
        System.out.println("```````````");
        System.out.println();

    }

    public void printInfoArray() {
        System.out.println("Array:");
        System.out.println("```````````");
        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i].toString());
        }
        System.out.println("```````````");
        System.out.println();
    }


}
