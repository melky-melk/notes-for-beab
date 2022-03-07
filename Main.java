// when you make a class its like you have a blueprint on how it will be made
class Person{
	// these are called attributes, like the information a class can contain in
	// so a Person will have a name and an age
	String name;
	int age;

	// this is a constructor, how you make "objects" from a class
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	} 

	// objects can also have methods inside of it
	public void printPerson(){
		System.out.println(this.name + " is " + this.age + " years old");
	}
}

public class Main {

	public static void main(String[] args){
		// objects are created like this, its like how you make a scanner
		Person melk = new Person("Chiara", 19);
		System.out.println(melk.name);

		
		Person beab = new Person("Bean", 18);
		beab.printPerson();
	}
}