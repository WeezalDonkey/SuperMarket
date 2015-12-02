public class Cashier{
	public String checkOut(Cart cart){
		String receipt = "";
		double total = 0;
		while(!cart.isEmpty()){
			Item item = cart.removeOneItem();
			total += item.getPrice() * item.getQuanity();
			receipt += String.format("%20s..X%s....%6s.........$%5s\n", item.getName(),item.getQuanity(),item.getBarCode(),item.getPrice());
		}
		receipt += String.format("TOTAL%44s\n", String.format("$%s", total));
		return receipt;
	}
}
