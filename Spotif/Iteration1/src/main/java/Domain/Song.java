package Domain;

public class Song extends Album{
	
	private String idSong;
	private String titleSong;
	private String singerSong;
	private double priceSong;
	private String dateSong;
	
	public Song(String idAlbum, String title, String singer, double price, String date,
		String idSong, String titleSong, String singerSong, double priceSong, String dateSong) {
		super(idAlbum, title, singer, price, date);
		this.idSong = idSong;
		this.titleSong = titleSong;
		this.singerSong = singerSong;
		this.priceSong = priceSong;
		this.dateSong = dateSong;
	}

	public String getIdSong(){
		return idSong;
	}

	public String getTitle(){
		return titleSong;
	}

	public String getSingerSong(){
		return singerSong;
	}

	public double getPriceSong(){
		return priceSong;
	}

	public String getDateSong(){
		return dateSong;
	}
}
