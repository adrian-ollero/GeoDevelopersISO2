package Domain;

/**
 * @author Pablo
 *
 */
public class Message {
	
	/**
	 * 
	 */
	protected long idMessage;
	/**
	 * 
	 */
	protected String sender;
	/**
	 * 
	 */
	protected String receiver;
	/**
	 * 
	 */
	protected String description;
	
	/**
	 * @param idMessage
	 * @param sender
	 * @param receiver
	 * @param description
	 */
	public Message(long idMessage, String sender, String receiver, String description) {
		this.idMessage = idMessage;
		this.sender = sender;
		this.receiver = receiver;
		this.description = description;
	}
	
	//Method we have done during testing
	/**
	 * @return
	 */
	public long getIdMessage() {
		return idMessage;
	}
	
	/**
	 * @return
	 */
	public String getSender() {
		return sender;
	}
	
	//Modified during testing
	/**
	 * @param sender
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	/**
	 * @return
	 */
	public String getReceiver() {
		return receiver;
	}
	
	/**
	 * @param receiver
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
