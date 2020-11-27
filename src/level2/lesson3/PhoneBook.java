package level2.lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, Set<String> numbers) {
        this.phoneBook.put(name, numbers);
    }

    public Set<String> getPhones(String name) {
        return this.phoneBook.get(name);
    }
}
