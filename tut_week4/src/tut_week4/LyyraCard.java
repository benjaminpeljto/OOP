package tut_week4;

public class LyyraCard {
	private double balance;

	public LyyraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}

	public String toString() {
		return ("The card has " + this.balance + " euros!");
	}

	public void payEconomical() {

		if (balance >= 2.5) {
			balance -= 2.5;
		}
	}

	public void payGourmet() {

		if (balance >= 4.0) {
			balance -= 4.0;
		}
	}

	public void loadMoney(double amount) {
		if (amount > 0) {
			balance += amount;
			if (balance > 150) {
				balance = 150;
			}
		}
	}
}