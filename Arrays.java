import java.util.*;

public class Arrays {
    public static void main(String[] args){
        //can be made initially using curly brackets
        String[] cars = {"Tesla", "BMW", "chiarus compact", "Honda"};

		System.out.println(cars[0]); //will print tesla

        //or can be made empty and filled in later. length of the array has to be specified within the square brackets
        //follows the syntax: DataType[] arrayName = new DataType[number of items inside the array]
        //the number of items inside will tell the computer how many bytes of memory to use 
        String[] moreCars = new String[4];

        //to fill in an empty array use the index and the data next to it
        cars[0] = "Tesla";
        cars[1] = "BMW";
        cars[2] = "chiarus compact";
        cars[3] = "Honda";

		//you can print all the items inside of the array using a loop
		for (int i = 0; i < moreCars.length; i++)
			System.out.println(cars[i]);
    }
}