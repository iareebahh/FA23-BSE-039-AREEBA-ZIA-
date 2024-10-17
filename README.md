# FA23-BSE-039-AREEBA-ZIA-
MESSAGING APP
package messageapp;
//CLASS MESSAGE DRIVER
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

//CLASS MESSAGE
package messageapp;
import java.time.LocalDateTime;
public class Message {
    String sender;
    String receiver;
    String content;
    String messageId;
    boolean status;
    LocalDateTime timestamp;
    public Message(String sender, String receiver, String content, boolean status) {
    	System.out.println("Constructor called");
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.status = status;
        timestamp = LocalDateTime.now();
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getMessageId() {
        return messageId;
    }
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    
    
    @Override
    public String toString() {
    	System.out.println("Overide");
        return "Message{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", content='" + content + '\'' +
                ", messageId='" + messageId + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                '}';
    }
    
}

//CLASS MESSAGINAPP
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
