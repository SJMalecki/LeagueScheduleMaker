package pl.sjmprofil;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private int won;
    private int lost;
    private int tied;
    private int gamesPlayed;

    private ArrayList<Contestant> squad;

    public Team(String teamName){
        this.teamName = teamName;
        this.squad = new ArrayList<Contestant>();
    }

    public boolean addContestant(Contestant contestant){
        if(squad.contains(contestant)){
            System.out.println("Player already in team");
            return false;
        }else{
            squad.add(contestant);
            System.out.println("Player " + contestant.getName() + " added to " + teamName + " team");
            return true;
        }
    }
    

    public void printSquad(){
        if(!squad.isEmpty()) {
            System.out.println(teamName);
            for (int i = 0; i < squad.size(); i++) {
                System.out.println((i+1) + ". " + squad.get(i).getName());
            }
        }else{
            System.out.println("There is no one in team yet. Please add players");
        }
    }



}
