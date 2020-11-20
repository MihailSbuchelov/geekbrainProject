package level2.lesson1.sportsmen;

import level2.lesson1.behavior.SportBehavior;

public class Team {
    protected String nameTeam;

    public String getNameTeam() {
        return nameTeam;
    }

    public SportBehavior[] getSportsmen() {
        return sportsmen;
    }

    protected SportBehavior[] sportsmen;

    public Team(String nameTeam, SportBehavior[] sportsmen) {
        this.nameTeam = nameTeam;
        this.sportsmen = sportsmen;
    }

    public void showInfoTeam() {
        System.out.println("Team: " + this.nameTeam);
        for (SportBehavior sportsman : sportsmen) {
            System.out.println(sportsman.toString());
        }
    }

    public void showResult() {
        System.out.println("Result: ");
        for (SportBehavior sportsman : sportsmen) {
            if (sportsman.getWinFlag())
                System.out.println(sportsman.toString() + " passed all barriers!");
        }
    }
}