package Domain;

public class Album{
	
	private String idAlbum;
	private String title;
	private String singer;
	private double price;
	private String date;
	
	public Album(String idAlbum, String title, String singer, double price, String date) {
		this.idAlbum = idAlbum;
		this.title = title;
		this.singer = singer;
		this.price = price;
		this.date = date;
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
	
}

