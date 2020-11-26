package level2.lesson3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String number, String name) {
        this.phoneBook.put(number, name);
    }

    public String getPhone(String name) {
        String valueNumber = "";
        for (Map.Entry<String, String> val : this.phoneBook.entrySet()) {
            if (val.getValue().equals(name)) {
                valueNumber += val.getKey() + "; ";
            }
        }
        return valueNumber;
    }
}
