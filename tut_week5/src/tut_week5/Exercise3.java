package tut_week5;

public class Exercise3 {

	public static void main(String[] args) {
		Team barcelona = new Team("FC Barcelona");
		 
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
 
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
 
        barcelona.printPlayers();

	}

}
