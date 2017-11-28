package Domain; 

public class Song_it3 extends Song{

	public Song_it3(String idSong, String title, String singer, double price, String date) {
		super(idSong, title, singer, price, date);
	}
	
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public void setSinger(String singer) {
		this.singer=singer;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void setDate(String date) {
		this.date=date;
	}
	
	public void setSong(String idSong) {
		this.idSong=idSong;
	}
}
