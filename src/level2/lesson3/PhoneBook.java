package level2.lesson3;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<PhoneLine> phoneBook;

    public PhoneBook() {
        this.phoneBook = new ArrayList<>();
    }

    public void add(String name, String number) {
        this.phoneBook.add(new PhoneLine(name, number));
    }

    public String getPhone(String name) {
        String valueNumber = "";
        for (PhoneLine phoneLine : phoneBook) {
            if (phoneLine.name.equals(name)) {
                valueNumber += phoneLine.telephone + "; ";
            }
        }
        return valueNumber;
    }
}
