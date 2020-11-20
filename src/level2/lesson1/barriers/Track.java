package level2.lesson1.barriers;

import level2.lesson1.behavior.BarrierBehavior;
import level2.lesson1.behavior.SportBehavior;

public class Track implements BarrierBehavior {
    protected int threshold;

    public Track(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean passedBarrier(SportBehavior sportsman) {
        if (sportsman.run(this.threshold)) {
            System.out.println("passed Track is OK");
            return true;

        } else {
            System.out.println("passed Track is FAILED");
            return false;
        }

    }
}
