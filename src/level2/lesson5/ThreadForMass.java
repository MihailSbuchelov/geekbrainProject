package level2.lesson5;

public class ThreadForMass implements Runnable {
    float[] arr;

    public ThreadForMass(float[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(String.format("Part values calculated from %s sec in Thread: %s", (System.currentTimeMillis() - a) / 1000,
                Thread.currentThread().getName()));
    }
}
