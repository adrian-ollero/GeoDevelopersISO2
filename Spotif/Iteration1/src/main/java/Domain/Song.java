package Domain;

public class Song{
	
	protected String idSong;
	protected String title;
	protected String singer;
	protected double price;
	protected String date;
	
	public Song(String idSong, String title, String singer, double price, String date) {
		this.idSong = idSong;
		this.title = title;
		this.singer = singer;
		this.price = price;
		this.date = date;
	}

	public String getIdSong(){
		return idSong;
	}

	public String getTitle(){
		return title;
	}

	public String getSinger(){
		return singer;
	}

	public double getPrice(){
		return price;
	}

	public String getDate(){
		return date;
	}
}

