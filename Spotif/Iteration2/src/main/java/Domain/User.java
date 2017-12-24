package Domain;

/**
 * @author Pablo
 *
 */
public class User {
	
	/**
	 * 
	 */
	private String user;
	/**
	 * 
	 */
	private String password;
	
	/**
	 * @param user
	 * @param password
	 */
	public User(String user, String password) {
		this.user = user;
		this.password = password;
	}

	/**
	 * @return
	 */
	public String getUser() {
		return user;
	}
	
	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param user
	 * @param password
	 */
	public void read(String user, String password) {
		
	}
	
	/**
	 * @param user
	 * @param password
	 */
	public void insert(String user, String password) {
		
	}
}