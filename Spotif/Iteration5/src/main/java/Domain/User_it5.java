package Domain;

import java.util.*;

import Domain.Song_it3;
import Domain.User_it4;

/**
 * @author Pablo
 *
 */
public class User_it5 extends User_it4 {

	/**
	 * @param user
	 * @param password
	 * @param songs
	 */
	public User_it5(String user, String password, ArrayList<Song_it3> songs) {
		super(user, password, songs);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idSong
	 */
	public void deleteSong(String idSong) {
		for (int i = 0; i < songs.size(); i++) {
			if (songs.get(i).getIdSong().contentEquals(idSong)) {
				songs.remove(i);
				i--;
			}
		}
	}
}
