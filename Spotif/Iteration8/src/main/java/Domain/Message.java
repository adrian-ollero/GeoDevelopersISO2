package Domain;

public class Message {
	
	protected long idMessage;
	protected String sender;
	protected String receiver;
	protected String description;
	
	public Message(long idMessage, String sender, String receiver, String description) {
		this.idMessage=idMessage;
		this.sender=sender;
		this.receiver=receiver;
		this.description=description;
	}
	
	//Method we have done during testing
	public long getIdMessage() {
		return idMessage;
	}
	
	public String getSender() {
		return sender;
	}
	
	//Modified during testing
	public void setSender(String sender) {
		this.sender=sender;
	}
	
	public String getReceiver() {
		return receiver;
	}
	
	public void setReceiver(String receiver) {
		this.receiver=receiver;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
}
