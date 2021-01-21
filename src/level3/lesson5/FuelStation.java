package level3.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FuelStation {
    List<Transport> transports = new ArrayList<>();
    Semaphore semaphore = new Semaphore(3);
    int sizeRefuel = 10;

    public FuelStation(List<Transport> transportsReal) {
        transports.addAll(transportsReal);
    }

    public void refuel() {
        for (Transport transport : transports) {

            ReentrantReadWriteLock lock = transport.getLock();
            new Thread(() -> {
                try {
                    System.out.println("Transport " + transport.name + " before fuel station");
                    semaphore.acquire();
                    lock.writeLock().lock();
                    int curValue = transport.getFuelVolume() + sizeRefuel;
                    transport.setFuelVolume(curValue);
                    System.out.println("Transport " + transport.name + " refueled " + sizeRefuel + " l");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Transport " + transport.name + " left fuel station");
                    semaphore.release();
                    lock.writeLock().unlock();
                }
            }).start();
        }

    }
}
