package tut_week8;

public class ShopMain {

	public static void main(String[] args) {
		/*StoreHouse store = new StoreHouse();
		
		store.addProduct("milk", 3, 10); 
		store.addProduct("coffee", 5, 7);
		
		System.out.println("prices: ");
		System.out.println("milk: " + store.price("milk"));
		System.out.println("coffee: " + store.price("coffee"));
		System.out.println("sugar:" + store.price("sugar"));*/
		
		
		/*StoreHouse store = new StoreHouse(); 
		store.addProduct("coffee", 5, 1);
		System.out.println("stocks: "); 
		System.out.println("coffee: " + store.stock("coffee"));
		System.out.println("sugar: " + store.stock("sugar"));
		System.out.println("we take a coffee " + store.take("coffee")); 
		System.out.println("we take a coffee " + store.take("coffee")); 
		System.out.println("we take sugar " + store.take("sugar"));
		System.out.println("stocks: ");
		System.out.println("coffee: " + store.stock("coffee")); 
		System.out.println("sugar: " + store.stock("sugar"));*/
		
		/*StoreHouse store = new StoreHouse(); 
		store.addProduct("milk", 3, 10); 
		store.addProduct("coffee", 5, 6); 
		store.addProduct("buttermilk", 2, 20); 
		store.addProduct("jogurt", 2, 20);
		System.out.println("products:");
		for (String product : store.products()) {
			System.out.println(product);
		}*/
		
		/*Purchase purchase = new Purchase ("milk", 4, 2);
		System.out.println("the total price of a purchase containing four milks is " + purchase.price());
		System.out.println(purchase);
		purchase.increaseAmount();
		System.out.println( purchase );*/
		
		/*ShoppingBasket basket = new ShoppingBasket();
		basket.add("milk", 3);
		basket.add("buttermilk", 2);
		basket.add("cheese", 5);
		System.out.println("basket price: " + basket.price());
		basket.add("computer", 899); 
		System.out.println("basket price: "	+ basket.price());
		
		basket.print();*/
		
		ShoppingBasket basket = new ShoppingBasket(); 
		basket.add("milk", 3);
		basket.print();
		System.out.println("basket price: " + basket.price() +"\n");
		basket.add("buttermilk", 2);
		basket.print();
		System.out.println("basket price: " + basket.price() + "\n");
		basket.add("milk", 3); 
		basket.print();
		System.out.println("basket price: " + basket.price() +"\n");
		basket.add("milk", 3); 
		basket.print();
		System.out.println("basket price: " + basket.price() +"\n");
		
		
		
		
		
		
		
		
		
		
	}

}
