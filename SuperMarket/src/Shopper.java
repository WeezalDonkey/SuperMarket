import java.util.Vector;
import java.util.Enumeration;
public class Shopper {
	private Vector<Item> shoppingList;
	private float wallet;
	private ShopperType shopperType;
	private Cart cart;
	
	public Shopper(float w, ShopperType c){
		shoppingList = new Vector<Item>();
		setWallet(w);
		setShopperType(c);
		cart = new Cart();
	}	
	public void Pay(float amount) throws Exception{
		if (amount <= wallet)
			wallet -= amount;
		else
			throw new Exception("Sorry you don't have enough cash in wallet.");
	}
	
	public Cart fillCart(Supermarket market) throws Exception{
		Enumeration<Item> run = shoppingList.elements();
		while (run.hasMoreElements()){
			Item item = run.nextElement();
			Vector<Item> foundItems = market.searchItem(item);
			if (!foundItems.isEmpty()){
				Item selectedItem = getPreferredItem(foundItems, item);
				cart.add(selectedItem);
			}
		}
		return cart;
	}

public void setCart(Cart cart){
	this.cart = cart;}

public Cart getCart(){
	return cart;}

public void setShopperType(ShopperType shopperType){
	this.shopperType = shopperType;}

public ShopperType getShopperType(){
	return shopperType;}

public void setWallet (float wallet){
	this.wallet = wallet;}

public float getWallet (){
	return wallet;}

public void addToShoppingList (Item item){
	shoppingList.add(item);}

public Vector<Item> getShoppingList (){
	return shoppingList;}

private Item getPreferredItem(Vector<Item> itemsFound, Item item) throws Exception {
	Item preferredItem = itemsFound.firstElement();
	Enumeration<Item> run = itemsFound.elements();
	while (run.hasMoreElements()){
		double lowestPrice =1e10;
		Item currentItem =run.nextElement();
		String description = currentItem.getName().toLowerCase();
		switch(shopperType){
		case Price:
			if(currentItem.getPrice() < lowestPrice) {
				lowestPrice = currentItem.getPrice();
				preferredItem = currentItem;
			}
			break;
		case Quality:
			if(description.contains("grass fed")||description.contains("organic")){
				preferredItem = currentItem;
				break;
			}
			break;
		}
	}
	Item p = preferredItem;
	return new Item(item.getQuanity(), p.getName(), p.getPrice(), p.getBarCode());
	}
}

