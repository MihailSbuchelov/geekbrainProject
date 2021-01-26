package level3.lesson5;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class Transport {
    String name;

    int sizeTank;
    public abstract ReentrantReadWriteLock getLock();
    public abstract void execute();
    public abstract void setFuelVolume(int fuelVolume);
    public abstract int getFuelVolume();
    public abstract int getSizeTank();
}
