package assessment3;

public class item {
	 int code;
	String name;
	double price;
	int quantity;
	int rem=0;
	public item(int code, String name, double price, int quantity) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public item(int rem) {
		this.rem=rem;
	}

	

}
