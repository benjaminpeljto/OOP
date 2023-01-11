package tut_week8;

public class Purchase {
	
	private String product;
	private int unitAmount;
	private int unitPrice;
	
	public Purchase(String product, int amount, int unitPrice) {
		this.product = product;
		this.unitAmount = amount;
		this.unitPrice = unitPrice;
	}
	
	public Purchase(String product, int unitPrice) {
		this.product = product;
		this.unitAmount = 1;
		this.unitPrice = unitPrice;
	}
	
	public int price() {
		return this.unitAmount * this.unitPrice;
	}
	
	public void increaseAmount() {
		this.unitAmount += 1;
	}
	
	public String getProduct() {
		return this.product;
	}
	
	@Override
	public String toString() {
		return this.product + ": " + this.unitAmount;
	}

}
