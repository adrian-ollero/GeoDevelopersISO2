package Domain;

public class Album_it3 extends Album{

	public Album_it3(String idAlbum, String title, String singer, double price, String date, Song [] listSongs) {
		super(idAlbum, title, singer, price, date, listSongs);
	}
	
	public void setidAlbum(String idAlbum) {
		this.idAlbum=idAlbum;
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
}
