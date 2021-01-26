package level3.lesson5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static java.lang.Thread.sleep;

public class Truck extends Transport{
    private ReentrantReadWriteLock lock;
    private double fuelFlow;
    private int fuelVolume;

    public Truck(String name) {
        this.sizeTank = 60;
        this.fuelFlow = 15;
        this.fuelVolume = 60;
        this.lock = new ReentrantReadWriteLock();
        this.name = name;
    }


    public void changeVolumeFuel() {
        while (this.fuelVolume >= this.fuelFlow) {
            try {
                sleep(4000);
                lock.writeLock().lock();
                this.fuelVolume -= this.fuelFlow;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
            }
        }
        if (this.fuelVolume > 0) {
            System.out.println("Truck " + this.name + " almost without fuel");
        }
        System.out.println("Truck " + this.name + " stopped!");
    }


    public void readCountFuel() {
        while (this.fuelVolume > this.fuelFlow) {
            try {
                lock.readLock().lock();
                System.out.println("Volume fuel for " + this.name + ": " + this.fuelVolume + " l");
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }

        }
        System.out.println("Empty tank. You need refuel " + this.name + "!");
    }

    public void setFuelVolume(int fuelVolume) {
        try {
            lock.writeLock().lock();
            this.fuelVolume = fuelVolume;
        } finally {
            lock.writeLock().unlock();
        }

    }

    @Override
    public int getFuelVolume() {
        return this.fuelVolume;
    }

    @Override
    public int getSizeTank() {
        return this.sizeTank;
    }

    public ReentrantReadWriteLock getLock() {
        return lock;
    }

    public void execute() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(this::readCountFuel);
        executorService.submit(this::changeVolumeFuel);
        executorService.shutdown();
    }
}
