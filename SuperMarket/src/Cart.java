import java.util.Stack;
public class Cart {
private Stack<Item> shoppingCart = new Stack<Item>();

public Cart(){}

	public Boolean isEmpty(){
		return shoppingCart.empty();
	}
	
	public Item removeOneItem(){
		return shoppingCart.pop();
	}
	
	public void remove(Item item){
		shoppingCart.remove(item);
	}
	
	public void add(Item item){
		shoppingCart.add(item);
	}
}
