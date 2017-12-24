package domain;

/**
 * @author Pablo
 *
 */
public class Song {
	
	/**
	 * 
	 */
	protected String idSong;
	/**
	 * 
	 */
	protected String title;
	/**
	 * 
	 */
	protected String singer;
	/**
	 * 
	 */
	protected double price;
	/**
	 * 
	 */
	protected String date;
	
	/**
	 * @param idSong
	 * @param title
	 * @param singer
	 * @param price
	 * @param date
	 */
	public Song(String idSong, String title, String singer, double price, String date) {
		this.idSong = idSong;
		this.title = title;
		this.singer = singer;
		this.price = price;
		this.date = date;
	}

	/**
	 * @return
	 */
	public String getIdSong() {
		return idSong;
	}

	/**
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return
	 */
	public String getDate() {
		return date;
	}
}

