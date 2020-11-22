package level2.lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String element, NumberFormatException e) {
        super(element, e);
    }
}
