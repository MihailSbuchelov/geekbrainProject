package level2.lesson2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String element, Throwable cause) {
        super(element, cause);
    }
}
