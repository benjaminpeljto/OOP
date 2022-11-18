package tut_week5;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> players;
	private int maxSize;
	private int size;
	
	
	public Team(String nameOfTeam) {
		this.name = nameOfTeam;
		this.players = new ArrayList<>();
		this.maxSize = 16;
		this.size = players.size();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public void addPlayer(Player p1) {
		if(this.size < this.maxSize) {
		players.add(p1);
		size++;
		}
	}
	
	public void printPlayers() {
		for(Player player : players) {
			System.out.println(player);
		}
	}
	
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public int size() {
		return players.size();
	}
	
	public int goals() {
		int sum = 0;
		for(Player player : players) {
			sum += player.getGoals();
		}
		return sum;
	}
}
