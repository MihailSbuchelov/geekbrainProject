package lessons;

public class Lesson2 {

    int[] massTask1 = new int[5];
    int[] massTask2 = new int[8];
    int[] massTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    int[][] massTask4 = new int[5][5];

    public int[] getMassTask1() {
        return massTask1;
    }

    public int[] getMassTask2() {
        return massTask2;
    }

    public int[] getMassTask3() {
        return massTask3;
    }

    public int[][] getMassTask4() {
        return massTask4;
    }


    public Lesson2() {
        System.out.println("Stast init(print) block");
        System.out.println("_______________________");
        System.out.println();
        System.out.println("init massTask1 variable");
        for (int i = 0; i < 5; i++) {
            if (Math.random() >= 0.5) {
                massTask1[i] = 1;
            } else massTask1[i] = 0;
            System.out.println("massTask1[" + i + "]= " + massTask1[i]);
        }

        System.out.println();
        System.out.println("init massTask2 variable");
        for (int i = 0; i < 8; i++) {
            massTask2[i] = i * 3;
            System.out.println("massTask2[" + i + "]= " + massTask2[i]);
        }

        System.out.println();
        System.out.println("print massTask3 variable");
        for (int i = 0; i < massTask3.length; i++) {
            System.out.println("massTask3[" + i + "]= " + massTask3[i]);
        }
        System.out.println();
        System.out.println("init massTask4 variable");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) massTask4[i][j] = 1;
                System.out.println("massTask4[" + i + "][" + j + "]= " + massTask4[i][j]);
            }
        }
        System.out.println();
        System.out.println("end init(print) block");
        System.out.println("_____________________");


    }

    public void changePlaceForMassTask1() {
        System.out.println();
        System.out.println("change massive elements");
        for (int i = 0; i < massTask1.length; i++) {
            if (massTask1[i] == 1) {
                massTask1[i] = 0;
            } else massTask1[i] = 1;
            System.out.println("massTask1[" + i + "]= " + massTask1[i]);
        }

    }

    public void changeValForMassTask3() {
        System.out.println();
        System.out.println("change values for massTask3");
        for (int i = 0; i < massTask3.length; i++) {
            if (massTask3[i] < 6) {
                massTask3[i] = massTask3[i] * 2;
            }
            System.out.println("massTask3[" + i + "]= " + massTask3[i]);
        }
    }

    public static void minMaxValTask5(int[] mass) {
        System.out.println();
        System.out.println("min\\max calculating from mass[]..");
        int maxVal = mass[0];
        int minVal = mass[0];
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i + 1] > maxVal) maxVal = mass[i + 1];
            if (mass[i + 1] < minVal) minVal = mass[i + 1];
        }
        System.out.println("max value= " + maxVal);
        System.out.println("min value= " + minVal);
    }

    public static boolean checkBalanceTask6(int[] mass) {
        System.out.println("checkBalanceTask6 working..");
        boolean result = false;
        int leftSum = 0;
        int rightSum = 0;
        int position = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j <= i; j++) {
                leftSum += mass[j];
            }
            for (int k = i + 1; k < mass.length; k++) {
                rightSum += mass[k];
            }
            if (leftSum == rightSum) {
                result = true;
                position = i;
                break;
            }
            leftSum = 0;
            rightSum = 0;
        }

        System.out.println("checking result: " + result);
        System.out.println("border-number element: " + position);
        return result;
    }

    public static void replaceMassElementsTask7(int[] mass, int n) {
        System.out.println("replace mass elements..");
        if (n > 0) {
            while (n > 0) {
                int lastVar = mass[mass.length - 1];
                for (int counter = 0; counter < mass.length; counter++) {
                    int curVar = mass[counter];
                    mass[counter] = lastVar;
                    lastVar = curVar;
                }
                n--;
            }
        } else if (n < 0) {
            while (n < 0) {
                int lastVar = mass[0];
                for (int counter = mass.length - 1; counter >= 0; counter--) {
                    int curVar = mass[counter];
                    mass[counter] = lastVar;
                    lastVar = curVar;
                }
                n++;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.println("mass[" + i + "]=" + mass[i]);
        }
        System.out.println();

    }
}
