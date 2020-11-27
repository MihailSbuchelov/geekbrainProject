package level2.lesson3;

import java.util.*;

public class ArrayCollectionTest {
    private List<String> arrayList;

    public ArrayCollectionTest(String[] arrayList) {
        this.arrayList = Arrays.asList(arrayList);
    }

    private Set<String> getUniqMassElements() {
        Set<String> set = new HashSet<>(arrayList);
        return set;
    }

    public void printUniqElements() {
        for (String element : getUniqMassElements()) {
            System.out.println(element);
        }
    }

    public Map<String, Integer> calcCountForEachElement() {
        Map<String, Integer> result = new HashMap<>();
        for (String e : this.arrayList) {
            result.put(e, calcCountForElement(e));
        }
        return result;
    }

    private int calcCountForElement(String val) {
        int counter = 0;
        for (String element : this.arrayList) {
            if (element.equals(val)) counter += 1;
        }
        return counter;
    }

}
