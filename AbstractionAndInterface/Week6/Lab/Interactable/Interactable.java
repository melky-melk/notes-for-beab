// kind of like a blueprint, not a class, forces methods that the class has to implement
// interface models behabious and behaviour only has actions, 
// tries to model/describe behaviour, NOT ATTRIBUTES, FORCE THAT CLASS TO IMPLEMENT THAT BEHAVIOUR AND ALL THE METHODS SHOULD IMPLEMENT THAT BEHAVIOUR
// like a dog, player, robot are all things that are interactable, but you dont want to put them in a parent class because they are still so different
// to group these into xomdthing, is an interface, again like an abstract class they will all do things differently like running, walking, talking is all different depending on the subclass
// way you implement how they tak is different, interface models that
// you can group interfaces in the same arraylist
// they all share comminality 

// each class can implement multiple interfaces
// It is not a class
// interface is a blueprint it doesnt have anything, no attributes

public interface Interactable{
	public void talkTo(Interactable thing);

	public List<String> getResponseScript();

	public List<String> getContactScript();
}