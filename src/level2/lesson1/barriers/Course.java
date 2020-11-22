package level2.lesson1.barriers;

import level2.lesson1.behavior.BarrierBehavior;
import level2.lesson1.behavior.SportBehavior;
import level2.lesson1.sportsmen.Team;

public class Course {
    protected BarrierBehavior[] barrierBehaviors;

    public Course(BarrierBehavior[] barrierBehaviors) {
        this.barrierBehaviors = barrierBehaviors;
    }

    public void dolt(Team team) {
        for (SportBehavior sportsmen : team.getSportsmen()) {
            for (BarrierBehavior barrierBehavior : this.barrierBehaviors) {
                if (barrierBehavior.passedBarrier(sportsmen)) {
                    System.out.println("next barrier");
                    System.out.println("-------------------------------------");
                } else {
                    System.out.println("next sportsmen");
                    System.out.println("-------------------------------------");
                    break;
                }
            }
        }
    }
}