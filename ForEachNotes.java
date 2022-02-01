public class ForEachNotes{
	public static void main(String[] args){

		String[] onlinePeeps = {"melk", "bean", "lemon", "lime"};

		// a for each loop essentially does the same thing as the following
		for (int i = 0; i < onlinePeeps.length; i++){
			String peep = onlinePeeps[i];

			System.out.println(peep);
		}

		//essentially it does the whole i thing for you
		//the i increments on its own until it reaches the end of the array
		// then it auto matically assigns the "peep" to onlinePeeps[i]
		//this reads for each peep in onlinePeeps
		for (String peep : onlinePeeps){
			System.out.println(peep);
		}

		//mainly used to easily assign a variable name to each element inside the array 
	}
}