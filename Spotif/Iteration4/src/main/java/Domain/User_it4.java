package Domain;

import java.util.*;

public class User_it4 extends User{

	protected ArrayList<Song_it3> songs;
	
	public User_it4(String user, String password, ArrayList<Song_it3> songs) {
		super(user, password);
		this.songs=songs;
	}
	
	public ArrayList<Song_it3>getListSongs() {
		return songs;
	}
	
	public double calculateTotalPrice() {
		double totalprice=0;
		for (int i=0; i<songs.size(); i++) {
			totalprice+=songs.get(i).getPrice();
		}
		return totalprice;
	}
}
