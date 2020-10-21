public class Main {

    public static void main(String[] args) {

        boolean b = true;
        int i = 33;
        long l = 12344l;
        float f = 123213.123f;
        double d = 1232.25656d;
        String s = "это строка";

        calcExpresion(1.222f, 2.2f, 3.33f, 0.0f);
        calcExpresion(1.222f, 2.2f, 3.33f, 1.0f);

        comparingSumWithLim(2, 19);

        printSignNum(-200);

        returnTrueForNegativeNum(-32);

        printName("Mike");

        countingBissextileOrNot(2019);

    }

    /*
    without processing zero-value into the param
     */
    static float calcExpresion(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        System.out.println(result);
        return result;
    }

    static boolean comparingSumWithLim(int a, int b) {
        int leftBorder = 10, rightBorder = 20;
        int sum = a + b;
        if (sum >= leftBorder && sum <= rightBorder) {
            return true;
        }
        return false;
    }

    static void printSignNum(int num) {
        if (num >= 0) {
            System.out.println("Число " + num + " положительное");
        }
        System.out.println("Число " + num + " отрицательное");
    }

    static boolean returnTrueForNegativeNum(int num) {
        if (num >= 0) {
            return false;
        }
        return true;
    }

    static void printName(String name) {
        System.out.println("Привет " + name + "!");
    }

    static void countingBissextileOrNot(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
            } else {
                System.out.println(year + " год является високосным");
            }

        } else {
            System.out.println(year + " год не является високосным");
        }


    }

}
