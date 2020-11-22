package level1.lessons;

public class Lesson1 {
    /*
    without processing zero-value into the param
     */
    public static float calcExpresion(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        System.out.println(result);
        return result;
    }

    public static boolean comparingSumWithLim(int a, int b) {
        int leftBorder = 10, rightBorder = 20;
        int sum = a + b;
        if (sum >= leftBorder && sum <= rightBorder) {
            return true;
        }
        return false;
    }

    public static void printSignNum(int num) {
        if (num >= 0) {
            System.out.println("Число " + num + " положительное");
        }
        System.out.println("Число " + num + " отрицательное");
    }

    public static boolean returnTrueForNegativeNum(int num) {
        if (num >= 0) {
            return false;
        }
        return true;
    }

    public static void printName(String name) {
        System.out.println("Привет " + name + "!");
    }

    public static boolean countingBissextileOrNot(int year) {
        boolean aboutYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (aboutYear) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");

        return aboutYear;
    }
}
