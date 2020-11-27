package level2.lesson3;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
            return;
        }
        Set<String> numbers = new HashSet<>();
        numbers.add(number);
        phoneBook.put(name, numbers);
    }

    public Set<String> getPhones(String name) {
        return this.phoneBook.getOrDefault(name, Collections.EMPTY_SET);
    }
}
