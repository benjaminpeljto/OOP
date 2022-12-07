package tut_week7;

public class Exercise2 {

	public static void main(String[] args) {
		
		//FIRST TEST
		
		/*PromissoryNote mattisNote = new PromissoryNote();
		mattisNote.setLoan("Arto", 51.5);
		mattisNote.setLoan("Mikael", 30);
		 
		System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
		System.out.println(mattisNote.howMuchIsTheDebt("Joel"));*/
		
		//SECOND TEST
		
		PromissoryNote mattisNote = new PromissoryNote();
		  mattisNote.setLoan("Arto", 51.5);
		  mattisNote.setLoan("Arto", 10.5);
		 
		  System.out.println(mattisNote.howMuchIsTheDebt("Arto"));

	}

}
