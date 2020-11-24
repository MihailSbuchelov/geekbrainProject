package level2.lesson3;

import java.util.*;

public class ArrayCollectionTest {
    private List<String> arrayList;
    private List<String> uniqArrayList;

    public ArrayCollectionTest(String[] arrayList) {
        this.arrayList = Arrays.asList(arrayList);
        uniqArrayList = new ArrayList<>();
    }

    public List<String> getUniqArrayList() {
        return getUniqMassElements();
    }

    // For all elements
    public Set<String> getUniqForAllArrayList() {
        return getUniqMassAllElements();
    }
    // For all elements
    private Set<String> getUniqMassAllElements() {
        Set<String> set = new HashSet<>(arrayList);
        return set;
    }


    private List<String> getUniqMassElements() {
        List<String> localCollection = new ArrayList<>();
        for (String element : arrayList) {
            localCollection.addAll(arrayList);
            localCollection.remove(element);
            if (uniqElement(element, localCollection)) {
                uniqArrayList.add(element);
            }
            localCollection.clear();
        }
        return uniqArrayList;
    }

    public void printUniqElements() {
        for (String element : getUniqMassElements()) {
            System.out.println(element);
        }
    }

    // For all elements
    public void printUniqAllElements() {
        for (String element : getUniqMassAllElements()) {
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

    private boolean uniqElement(String uniqElement, List<String> localCollect) {
        for (String e : localCollect) {
            if (e.equals(uniqElement)) return false;
        }
        return true;
    }
}
