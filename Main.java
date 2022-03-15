// when you make a class its like you have a blueprint on how it will be made
class Person{
	// these are called attributes, like the information a class can contain in
	// so a Person will have a onlineName and an age
	public String onlineName;
	public int age;

	// private meaning that it can only be accessed and changed from within its own class
	private String realName; 

	// this is a constructor, how you make "objects" from a class
	public Person(String onlineName, int age, String realName){
		this.onlineName = onlineName;
		this.age = age;
		this.realName = realName;
	} 

	// objects can also have methods inside of it
	public void printPerson(){
		System.out.println(this.onlineName + " is " + this.age + " years old");
	}

	// returns the real name
	public String getRealName() {return this.realName;}

	// given a new name, it will change the realName
	public void setRealName(String newName) {this.realName = newName;}
}

public class Main {

	public static void main(String[] args){
		// objects are created like this, its like how you make a scanner
		Person melk = new Person("melk", 19, "Chiara");
		System.out.println(melk.onlineName);
		System.out.println(melk.getRealName());

		// changes the real name
		melk.setRealName("Chickadee");
		System.out.println(melk.getRealName());

		
		Person beab = new Person("Bean", 18, "Emily");
		beab.printPerson();
	}
}