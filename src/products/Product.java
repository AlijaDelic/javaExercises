package products;

public abstract class Product {
	
	protected String name;
	protected String barcode;
	protected double price;
	protected final double tax = 20;
	
	public Product (String name, String barcode, double price ) {
		this.name = name;
		this.barcode = barcode;
		this.price = price;
	}
	
	protected double priceWithTaxes() {
		double finalPrice;
		finalPrice = this.price * (1 + this.tax / 100);
		return finalPrice;
	};
	
	@Override
	public String toString() { 
	    return "Name: " + this.name + ", barcode: " + this.barcode + ", price: " + this.price + 
	    		", tax: " + this.tax + " price with Taxes: " + this.priceWithTaxes();
	}
	
}