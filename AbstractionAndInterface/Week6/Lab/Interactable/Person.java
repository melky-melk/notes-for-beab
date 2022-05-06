import java.util.*;

public class Person {

	private String name;
	private List<String> contactScript;
	private List<String> responses;

	public Person(String name, List<String> contactScript, List<String> responses){
		this.name = name;
		this.contactScript = contactScript;
		this.responses = responses;
	}

	public String getName() {return this.name;}
	public List<String> getContactScript() {return this.contacts;}
	public List<String> getResponseScript() {return this.responses;}

	public void talkTo(Interactable thing){
		// conctant is the persons script
		// the respons script is gotten from the thing thing. resposne scroipt

		// then they print the contact then the reponse unttill its all finished
		//is talking to THIS person so it gets the person's contact? i like dialogue vetter but whatever
		List<String> contactScript = this.getContactScript();
		List<String> responseScript = thing.getResponseScript();

		for (int i = 0; i < contactScript.size() && i < responseScript.size(); i ++){
			System.out.println(contactScript.get(i));
			System.out.println(responseScript.get(i));
		}

		System.out.println("Bye");
	}
	// 
}