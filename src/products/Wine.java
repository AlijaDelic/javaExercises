package products;

public class Wine extends Product {
	private final double extraTax = 10;
	private double botleVolume;
	
	public Wine(String name, String barcode, double price, double botleVolume) {
		super(name, barcode, price);
		this.botleVolume = botleVolume;
	}

	@Override
	public double priceWithTaxes() {
		double finalPrice;
		finalPrice = super.priceWithTaxes() * (1 + this.extraTax / 100);
		return finalPrice;
	}

	@Override
	public String toString() { 
	    return (super.toString() + ", botleVolume: " + this.botleVolume + "l.");
	}
	

}