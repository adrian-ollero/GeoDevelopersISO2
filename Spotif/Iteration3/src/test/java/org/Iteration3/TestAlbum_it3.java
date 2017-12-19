package org.Iteration3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.Album_it3;
import Domain.Song_it3;

/**
 * Unit test for simple App.
 */
public class TestAlbum_it3
{

	private Album_it3 album;
    private Song_it3 [] listSongs;
    
    @Before
    public void setUp(){
    	album = new Album_it3("30657898qwe","Despacito","Luis Fonsi",2.99,"12-01-2017",listSongs);
    }
    
    @Test
    public void testExistentTitle(){
    	//datos de prueba
    	album.setTitle("Despacito Remix");
    	
    	assertTrue(!album.getTitle().contentEquals(""));
    }
    
    @Test
    public void testNonExistentTitle(){
    	//datos de prueba
    	album.setTitle("");
    	
    	assertTrue(album.getTitle().contentEquals(""));
    }
    
    @Test
    public void testMaximumCharacterTitle(){
    	//datos de prueba
    	album.setTitle("qwertyuiopasdfghjklñzxcvbn"
    			+ "mqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjk"
    			+ "lñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuio"
    			+ "pasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwe"
    			+ "rtyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqw"
    			+ "ertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuio"
    			+ "pasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghj"
    			+ "klñzxcvbnm");
    	
    	assertTrue(album.getTitle().length()>255);
    }
    
    @Test
    public void testExistentSinger(){
    	//datos de prueba
    	album.setSinger("Luis Fonsi & Daddy Yankee ft Justin Bieber");
    	
    	assertTrue(!album.getSinger().contentEquals(""));
    }
    
    @Test
    public void testNonExistentSinger(){
    	//datos de prueba
    	album.setSinger("");
    	
    	assertTrue(album.getSinger().contentEquals(""));
    }
    
    @Test
    public void testMaximumCharacterSinger(){
    	//datos de prueba
    	album.setSinger("qwertyuiopasdfghjklñzxcvbn"
    			+ "mqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjk"
    			+ "lñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuio"
    			+ "pasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwe"
    			+ "rtyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqw"
    			+ "ertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuio"
    			+ "pasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghj"
    			+ "klñzxcvbnm");
    	
    	assertTrue(album.getSinger().length()>255);
    }
    
    @Test
    public void testPositivePrice(){
    	//datos de prueba
    	album.setPrice(0.01);
    	
    	assertTrue(album.getPrice()>0);
    }
    
    @Test
    public void testFreePrice(){
    	//datos de prueba
    	album.setPrice(0.00);
    	
    	assertTrue(album.getPrice() == 0);
    }
    
    @Test
    public void testNegativePrice(){
    	//datos de prueba
    	album.setPrice(-8.00);
    	
    	assertTrue(album.getPrice() < 0);
    }
    
    @Test
    public void testExistentDate(){
    	//datos de prueba
    	album.setDate("17-11-2017");
    	
    	assertTrue(!album.getDate().contentEquals(""));
    }
    
    @Test
    public void testNonExistentdate(){
    	//datos de prueba
    	album.setDate("");
    	
    	assertTrue(album.getDate().contentEquals(""));
    }
    
}
