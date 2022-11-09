package tut_week4;

public class Exercise3 {

	public static void main(String[] args) {
		
		LyyraCard cardPekka = new LyyraCard(20);
		LyyraCard cardBrian = new LyyraCard(30);
		
		cardPekka.payGourmet();
		cardBrian.payEconomical();
		
		System.out.println("Pekka: " + cardPekka);
		System.out.println("Brian: " + cardBrian);
		
		cardPekka.loadMoney(20);
		cardBrian.payGourmet();
		
		System.out.println("Pekka: " + cardPekka);
		System.out.println("Brian: " + cardBrian);
		
		cardPekka.payEconomical();
		cardPekka.payEconomical();
		cardBrian.loadMoney(50);
		
		System.out.println("Pekka: " + cardPekka);
		System.out.println("Brian: " + cardBrian);
		
		
	}

}
