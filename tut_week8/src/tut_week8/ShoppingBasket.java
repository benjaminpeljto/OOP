package tut_week8;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
	
	private List<Purchase> basket;
	
	public ShoppingBasket() {
		basket = new ArrayList<>();
	}

	public void add(String product, int price) {
		boolean isInBasket = false;
		for(Purchase p : this.basket) {
			if(p.getProduct().equals(product)) {
				p.increaseAmount();
				isInBasket = true;
			}
		}
		
		if(!isInBasket) {
			this.basket.add(new Purchase(product,price));
		}
		
	}
	
	public int price() {
		int p = 0;
		for (Purchase purchase : basket) {
			p += purchase.price();
		}
		return p;
	}
	
	public void print() {
		for (Purchase purchase : basket) {
			System.out.println(purchase);
		}
	}
}
