import java.util.Vector;
import java.util.Enumeration;
public class Supermarket {
	private Cashier cashier;
	private Vector<Item> stock;
	
	public Supermarket() {
		cashier = new Cashier();
		stock = new Vector<Item>(0,15);
	}
	
public Cashier getCashier(){
	return cashier;
}
public void addToStock(Item item){
	stock.addElement(item);
}

	public Vector<Item> searchItem(Item item){
		String description = item.getName();
		Vector<Item> foundItem = new Vector<Item>(10,5);
		Enumeration<Item> run = stock.elements();
		while(run.hasMoreElements()){
			Item stockItem = run.nextElement();
			String stockItemDescription = stockItem.getName();
			if (stockItemDescription.contains(description))
				foundItem.add(stockItem);
		}
		return foundItem;
	}
}