package messageapp;

import java.util.ArrayList;
import java.util.List;

public class MessageDriver {
	
	public static void main(String[] args) {
		// Message message = new Message("Hello, World!");
		MessaginApp messageApp = new MessaginApp();
		messageApp.sendMessage("Areeba", "Usama", "Its too late");
		messageApp.sendMessage("Nabeeha", "Arham", "Its not too late");
		messageApp.sendMessage("Uzma", "Nosheen", "Its not too lateeeeeeeee");
		messageApp.displaySenderMessage("sender1");
		messageApp.displaySenderMessage("Areeba");
		messageApp.displaySenderMessage("Nabeeha");
		messageApp.displaySenderMessage("Uzma");
		
		
		List<String> list = new ArrayList<String>();
		list.add("areeba");
		list.add("nabeeha");
		list.add("usama");
		
		System.out.println(list.toString());		

		System.out.println("HERE");
	}
}