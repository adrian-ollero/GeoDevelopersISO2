package Domain;

public class Album{
	
	protected String idAlbum;
	protected String title;
	protected String singer;
	protected double price;
	protected String date;
	protected Song [] listSongs;
	
	public Album(String idAlbum, String title, String singer, double price, String date, Song [] listSongs) {
		this.idAlbum = idAlbum;
		this.title = title;
		this.singer = singer;
		this.price = price;
		this.date = date;
		this.listSongs=listSongs;
	}

	public String getIdAlbum(){
		return idAlbum;
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
	
	//Modified in the testing part
	public Song [] getListSongs() {
		return listSongs;
	}
}

