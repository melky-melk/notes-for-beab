import java.util.*;

public class Alien implements Interactable {
	private boolean isHostile;
	private List<String> contact;
	private List<String> responses;

	public void talkTo (Interactable thing) {
		// conctant is the persons script
		// the respons script is gotten from the thing thing. resposne scroipt

		// then they print the contact then the reponse unttill its all finished
		//is talking to THIS person so it gets the person's contact? i like dialogue vetter but whatever
		List<String> contactScript = this.getContactScript();
		List<String> responseScript = thing.getResponseScript();

		for (int i = 0; i < contactScript.size() && i < responseScript.size(); i ++){
			System.out.println(contactScript.get(i) + " beep boop.");
			System.out.println(responseScript.get(i));
		}

		System.out.println("Bye");
	}
}