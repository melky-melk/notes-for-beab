import java.util.*;

public class Lockers{
	public static void main(String[] args){
		int[] lockers = new int[100];

		//i starts at 1 and goes up to 5
		// i represents the students number i.e. when i = 1 = S1, S2, S3 etc 
		for (int i = 1; i <= 100; i++){
			
			//S1 starts at 1, S2 starts at 2 and so on so the increment here starts at the studnet number
			//S1 goes to every locker, S2 goes to every locker, S3 goes to every 3rd locker
			//so that means the j must increment according to the student's number
			for (int j = i; j <= lockers.length; j += i){
				
				//if the locker is closed, closed being 0, then open it, change it to 1
				if (lockers[j - 1] == 0)       {lockers[j - 1] = 1;}
				else if (lockers[j - 1] == 1)  {lockers[j - 1] = 0;}
			}
		}

		for (int i = 0; i < lockers.length; i++){
			// if the locker is open then print the index plus 1
			if (lockers[i] == 1){
				System.out.println(i + 1);
			}
		}

		boolean[] falseArray = new boolean[5];

		for (int i = 0; i < falseArray.length; i++){
			System.out.println(falseArray[i]);
		} 
	}
}