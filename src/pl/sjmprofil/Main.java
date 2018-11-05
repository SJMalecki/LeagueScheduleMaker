package pl.sjmprofil;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Team> teamsList = new ArrayList<Team>();

    public static void main(String[] args) {
        defaultTeams();
        for (int i = 0; i < teamsList.size(); i++) {
            System.out.println("");
            teamsList.get(i).printSquad();
            System.out.println(teamsList.get(i).toString());
        }


    }

    public static void defaultTeams() {
        Team teamOne = new Team("Breslauer Krähe");
        Team teamTwo = new Team("Krokodile Breslau");
        Team teamThree = new Team("Funke Wrocław");

        teamOne.addContestant(new PlatiniumContestant("Kimi Rikkonen"));
        teamOne.addContestant(new PlatiniumContestant("Sebastian Vettel"));
        teamOne.addContestant(new PlatiniumContestant("Valtterri Bottas"));
        teamOne.addContestant(new PlatiniumContestant("Max Verstappen"));
        teamOne.addContestant(new PlatiniumContestant("Lewis Hamilton"));

        teamTwo.addContestant(new GoldContestant("Daniel Ricciardo"));
        teamTwo.addContestant(new GoldContestant("Nico Hulkenberg"));
        teamTwo.addContestant(new GoldContestant("Sergio Perez"));
        teamTwo.addContestant(new GoldContestant("Kevin Magnussen"));
        teamTwo.addContestant(new GoldContestant("Fernando Alonso"));

        teamThree.addContestant(new SilverContestant("Romain Grosjean"));
        teamThree.addContestant(new SilverContestant("Esteban Ocon"));
        teamThree.addContestant(new SilverContestant("Charles Leclerc"));
        teamThree.addContestant(new SilverContestant("Stoffel Vandoorne"));
        teamThree.addContestant(new SilverContestant("Marcus Ericsson"));

        teamsList.add(teamOne);
        teamsList.add(teamTwo);
        teamsList.add(teamThree);

        teamOne.matchResult(teamTwo, 1, 3);
        teamOne.matchResult(teamTwo, 1, 2);
        teamOne.matchResult(teamThree, 2, 2);
        teamOne.matchResult(teamThree, 2, 3);
        teamTwo.matchResult(teamThree, 1, 2);
        teamTwo.matchResult(teamThree, 3, 2);

    }
}
