package Domain;

import java.util.*;

import Domain.Song_it3;
import Domain.User;

/**
 * @author Pablo
 *
 */
public class User_it4 extends User {

	/**
	 * 
	 */
	protected ArrayList<Song_it3> songs;
	
	/**
	 * @param user
	 * @param password
	 * @param songs
	 */
	public User_it4(String user, String password, ArrayList<Song_it3> songs) {
		super(user, password);
		this.songs = songs;
	}
	
	/**
	 * @return
	 */
	public ArrayList<Song_it3> getListSongs() {
		return songs;
	}
	
	/**
	 * @return
	 */
	public double calculateTotalPrice() {
		double totalprice = 0;
		for (int i = 0; i < songs.size(); i++) {
			totalprice += songs.get(i).getPrice();
		}
		return totalprice;
	}
}
