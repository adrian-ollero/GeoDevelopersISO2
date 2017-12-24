package domain;

/**
 * @author Pablo
 *
 */
public class Album {
	
	/**
	 * 
	 */
	protected String idAlbum;
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
	 * 
	 */
	protected Song[] listSongs;
	
	/**
	 * @param idAlbum
	 * @param title
	 * @param singer
	 * @param price
	 * @param date
	 * @param listSongs
	 */
	public Album(String idAlbum, String title, String singer, double price, String date, Song[] listSongs) {
		this.idAlbum = idAlbum;
		this.title = title;
		this.singer = singer;
		this.price = price;
		this.date = date;
		this.listSongs = listSongs;
	}

	/**
	 * @return
	 */
	public String getIdAlbum() {
		return idAlbum;
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
	
	//Modified in the testing part
	/**
	 * @return
	 */
	public Song[] getListSongs() {
		return listSongs;
	}
}

