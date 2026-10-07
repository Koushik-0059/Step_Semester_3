package control_flow.class_problems.assignment_problems.Week_5;

import java.util.Arrays;

class Player implements Comparable<Player> {

    String name;
    int matches;
    double average;
    boolean injured;

    Player(String name, int matches, double average, boolean injured) {
        this.name = name;
        this.matches = matches;
        this.average = average;
        this.injured = injured;
    }

    static boolean isDraftable(int matches) {
        return matches >= 10;
    }

    static boolean isDraftable(int matches, boolean injured) {
        return matches >= 5 && !injured;
    }

    public int compareTo(Player other) {
        return Double.compare(other.average, this.average);
    }
}

public class PlayerDraft {

    static String draftAndRank(Player[] players) {

        Player[] temp = new Player[players.length];
        int count = 0;

        for (Player p : players) {

            if (Player.isDraftable(p.matches) ||
                Player.isDraftable(p.matches, p.injured)) {

                temp[count] = p;
                count++;
            }
        }

        Player[] draftable = Arrays.copyOf(temp, count);

        Arrays.sort(draftable);

        String result = "";

        for (int i = 0; i < draftable.length; i++) {

            result += (i + 1) + ". " + draftable[i].name;

            if (i < draftable.length - 1)
                result += " | ";
        }

        return result;
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}