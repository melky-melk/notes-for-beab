public class FilteredJug extends Vessel {
	private int numberOfUses;

	public void fill(double amount) {
		if (numberOfUses > 30){
			return;
		}
		
		this.litres += amount;
	}
}