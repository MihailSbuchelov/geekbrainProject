package level2.lesson2;

public class TestException {


    public static int doMassWithExceptions(String[] stringMass) throws MyArraySizeException, MyArrayDataException {
        if (stringMass.length > 4)
            throw new MyArraySizeException(String.format("Incorrect array size %s", stringMass.length));
        int result = 0;
        int i = 0;
        for (String strings : stringMass) {
            i = i + 1;
            try {
                result = result + Integer.parseInt(strings);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(String.format("Incorrect dates = '%s' in the [%s] element", strings, i));
            }
        }
        return result;
    }
}
