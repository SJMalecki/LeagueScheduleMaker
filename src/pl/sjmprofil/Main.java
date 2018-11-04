package pl.sjmprofil;

public class Main {

    public static void main(String[] args) {
	    Team team = new Team("Breslauer Krähe");
	    team.addContestant(new PlatiniumContestant("Juan Pablo Montoya"));
	    team.addContestant(new PlatiniumContestant("Mark Webber"));

	    team.printSquad();

	    Team team2 = new Team("Poznań Krokodile");
	    team2.printSquad();
	    
	    team.matchResult(team2, 1,0);

    }
}
