import java.util.*;

public class Billboard implements Interactable {
	private String content;

	public Billboard(String content){
		this.content = content;
	}

	public void talkTo(Interactable thing){		
		System.out.println(thing.getContactScript.get(0));
		System.out.println(this.content);

		System.out.println("ok weird bye");
	}

	public List<String> getResponseScript(){
		ArrayList<String> content = new ArrayList<String>();
		content.add(this.content);
		return content;
	}
	
	public List<String> getContactScript(){
		ArrayList<String> content = new ArrayList<String>();
		content.add(this.content);
		return content;
	}
}