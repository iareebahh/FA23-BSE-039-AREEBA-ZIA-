package messageapp;

public class MessaginApp {
	
	Message messages[];
	static int messageCounter = 0;
	
	public MessaginApp()
	{
		System.out.println("MessaginApp DEFAULT constructor called");
		messages = new Message[100];
		// for (int i = 0; i < messages.length; i++)
		messages[0] = new Message("sender1", "receiver1", "message content", false);
	}


	public void sendMessage(String sender, String receiver, String content) {
		System.out.println("send message called");
		messages[++messageCounter] = new Message(sender, receiver, content, false);
	}

	public void displaySenderMessage(String sender) {
		System.out.println("Message counter: " +  messageCounter);
		for (int i = 0; i <= messageCounter; i++)
			if (messages[i].getSender().equals(sender)) {
				System.out.println(messages[i].toString());
				//System.out.println("Sender: " + messages[i].getSender());
				//System.out.println("Receiver: " + messages[i].getReceiver());
				//System.out.println("Content: " + messages[i].getContent());
				//System.out.println("Status: " + messages[i].isStatus());
				//messages[i].setRead();
			}
	}
}