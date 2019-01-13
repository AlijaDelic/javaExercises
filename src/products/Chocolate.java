package products;

public class Chocolate extends Product {
	
	private double weight;

	public Chocolate(String name,  String barcode, double price, double weight) {
		super(name, barcode, price);
		this.weight = weight;
	}
	
	@Override
	public String toString() { 
	    return (super.toString() + ", weight: " + this.weight + "kg.");
	} 
}

