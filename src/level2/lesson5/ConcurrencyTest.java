package level2.lesson5;

public class ConcurrencyTest {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void processingMassWithoutConcurrency() {
        float[] arr = initialMass();
        calculatingNewMassValues(arr);
    }

    public static void processingMassWithConcurrency() {
        float[] arr = initialMass();
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long b = (System.currentTimeMillis() - a) / 1000;
        System.out.println(String.format("Split the source mass in %s sec", b));

        new Thread(new ConcurrencyTest2(a1)).start();
        new Thread(new ConcurrencyTest2(a2)).start();

        long c = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long d = (System.currentTimeMillis() - c) / 1000;
        System.out.println(String.format("Concat two mass in %s sec", d));
    }

    private static void calculatingNewMassValues(float[] arr) {
        long a = System.currentTimeMillis();
        System.out.println("Calculate was starting without threads..");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(String.format("New values calculated from %s sec in Thread: %s \n", (System.currentTimeMillis() - a) / 1000,
                Thread.currentThread().getName()));
    }

    private static float[] initialMass() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }

}
