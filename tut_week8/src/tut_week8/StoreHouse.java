package tut_week8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StoreHouse {
	private Map<String, Integer> storage;
	private Map<String, Integer> stock;
	
	public StoreHouse() {
		this.storage = new HashMap<>();
		this.stock = new HashMap<>();
	}
	
	
	
	public void addProduct(String product, int price, int stock) {
		this.storage.put(product, price);
		this.stock.put(product,stock);
		
	}
	
	public int price(String product) {
		if(storage.containsKey(product)) {
			return storage.get(product);
		}
		else {
			return -99;
		}
	}
	
	public int stock(String product) {
		if(this.stock.containsKey(product)) {
			return this.stock.get(product);
		}
		else {
			return 0;
		}
	}
	
	public boolean take(String product) {
		if(this.stock.containsKey(product) && this.stock.get(product)>0) {
			this.stock.put(product, this.stock.get(product) -1);
			return true;
		}
		else {
			return false;
		}
	}
	
	public Set<String> products(){
		return storage.keySet();
	}

}
