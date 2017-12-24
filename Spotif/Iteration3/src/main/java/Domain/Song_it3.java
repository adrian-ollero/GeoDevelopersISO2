package Domain;

import Domain.Song;

/**
 * @author Pablo
 *
 */
public class Song_it3 extends Song {

	/**
	 * @param idSong
	 * @param title
	 * @param singer
	 * @param price
	 * @param date
	 */
	public Song_it3(String idSong, String title, String singer, double price, String date) {
		super(idSong, title, singer, price, date);
	}
	
	
	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @param singer
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * @param idSong
	 */
	public void setSong(String idSong) {
		this.idSong = idSong;
	}
}
