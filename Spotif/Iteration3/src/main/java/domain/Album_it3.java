package domain;

import domain.Album;
import domain.Song;

/**
 * @author Pablo
 *
 */
public class Album_it3 extends Album {

	/**
	 * @param idAlbum
	 * @param title
	 * @param singer
	 * @param price
	 * @param date
	 * @param listSongs
	 */
	public Album_it3(String idAlbum, String title, String singer, double price, String date, Song[] listSongs) {
		super(idAlbum, title, singer, price, date, listSongs);
	}
	
	/**
	 * @param idAlbum
	 */
	public void setidAlbum(String idAlbum) {
		this.idAlbum = idAlbum;
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
}
