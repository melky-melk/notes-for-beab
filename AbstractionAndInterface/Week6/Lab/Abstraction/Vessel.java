public abstract class Vessel{
	protected double litres;
	private double maxLitres;

	public Vessel(double litres, double maxLitres){
		this.litres = 0;
		this.maxLitres = maxLitres;	
	}
	// italics mrean it can be overidden 
	public abstract double pour(Vessel v, double amount){
		if (this.litres - amount >= 0){
			v.fill(amount);
		} else {
			amount = this.litres;
			v.fill(amount);
		}
		
		this.litres -= amount;
		return amount;
	}

	public abstract void fill(double amount) {
		if (amount > this.maxLitres){
			this.litres = maxLitres;
			return;
		}

		this.litres += amount;
	}

	public abstract double getLitres();

	public abstract double getCapacity(); 
}