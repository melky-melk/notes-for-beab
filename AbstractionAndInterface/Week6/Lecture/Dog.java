//dog is a subclass of animal that uses the method move
public class Dog extends Animal implements Movable, Speaker{

	// protected String name;
	
	// public Dog(String name){
	// 	this.name = name
	// }

	public Dog (String name){
		super(name)
	}

	public void move(){
		System.out.println("run");
	}

	public void communicate(){
		System.out.println("Woof");
	}
}