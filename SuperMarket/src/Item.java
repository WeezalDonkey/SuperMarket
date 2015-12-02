public class Item {
	private int Quanity;
	private String Name;
	private double Price;
	private int BarCode;
// constructors
	public Item(int q, String prod, double p, int bc) {
		// TODO Auto-generated constructor stub
		setQuanity(q);
		setName(prod);
		setPrice(p);
		setBarCode(bc);
	}

	public Item(int q, String name) {
		// TODO Auto-generated constructor stub
		setQuanity(q);
		setName(name);
		setPrice(0);
		setBarCode(0);
	}
// exceptions
	public void addQuanity(int q) throws Exception{
		if(q<=0) throw new Exception ("looking for positive quanity");
		Quanity += q;
	}

	public void removeQuanity(int q) throws Exception{
		if(q<=0) throw new Exception ("looking for positive quanity");
		Quanity -= q;
	}
// getters setters
	public int getQuanity() {
		return Quanity;
	}

	private void setQuanity(int q) {
		// TODO Auto-generated method stub
		Quanity = q;
	}

	public String getName() {
		return Name;
	}

	private void setName(String prod) {
		// TODO Auto-generated method stub
		Name = prod;
	}

	void addPrice(double p) {
		Price += p;
	}

	void removePrice(double p) {
		Price -= p;
	}

	public double getPrice() {
		return Price;
	}

	private void setPrice(double p) {
		// TODO Auto-generated method stub
		Price=p;
	}

	public int getBarCode() {
		return BarCode;
	}

	private void setBarCode(int bc) {
		// TODO Auto-generated method stub
		BarCode = bc;
	}

}
