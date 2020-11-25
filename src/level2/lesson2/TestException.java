package level2.lesson2;

public class TestException {


    public static int doMassWithExceptions(String[][] stringsMass) throws MyArraySizeException, MyArrayDataException {
        if (stringsMass.length > 4)
            throw new MyArraySizeException(String.format("Incorrect array size = %s", stringsMass.length));
        int result = 0;
        int i = 0;
        for (String[] strings : stringsMass) {
            i = i + 1;
            result = result + calcForMassString(strings, i);
        }
        return result;
    }

    private static int calcForMassString(String[] strings, int i) {
        if (strings.length > 4)
            throw new MyArraySizeException(String.format("Incorrect array element [%s] size = %s", i, strings.length));
        int result = 0;
        int j = 0;
        for (String string : strings) {
            try {
                j = j + 1;
                result = result + Integer.parseInt(string);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(String.format("Incorrect dates = '%s' in the [%s][%s] element", string, i, j), e);
            }
        }
        return result;
    }
}
