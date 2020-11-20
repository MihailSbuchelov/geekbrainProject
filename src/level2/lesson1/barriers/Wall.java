package level2.lesson1.barriers;

import level2.lesson1.behavior.BarrierBehavior;
import level2.lesson1.behavior.SportBehavior;

public class Wall implements BarrierBehavior {
    protected int threshold;

    public Wall(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean passedBarrier(SportBehavior sportsman) {
        if (sportsman.jump(this.threshold)) {
            System.out.println("passed Wall is OK");
            return true;
        } else {
            System.out.println("passed Wall is FAILED");
            return false;
        }
    }
}