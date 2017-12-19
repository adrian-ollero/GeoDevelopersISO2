package org.Iteration3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.Song;
import Domain.Song_it3;

/**
 * Unit test for simple App.
 */
public class TestSong_it3
{

    private Song_it3 song;
    
    @Before
    public void setUp(){
    	song = new Song_it3("306578981qwe","Despacito","Luis Fonsi ft. Daddy Yankee",2.99,"12-01-2017");
    }
    
    @Test
    public void testExistentTitle(){
    	//datos de prueba
    	song.setTitle("Échale la culpa");
    	
    	assertTrue(!song.getTitle().contentEquals(""));
    }
    
    @Test
    public void testNonExistentTitle(){
    	//datos de prueba
    	song.setTitle("");
    	
    	assertTrue(song.getTitle().contentEquals(""));
    }
    
    @Test
    public void testMaximumCharacterTitle(){
    	//datos de prueba
    	song.setTitle("qwertyuiopasdfghjklñzxcvbn"
    			+ "mqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjk"
    			+ "lñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuio"
    			+ "pasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwe"
    			+ "rtyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqw"
    			+ "ertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuio"
    			+ "pasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghj"
    			+ "klñzxcvbnm");
    	
    	assertTrue(song.getTitle().length()>255);
    }
    
    @Test
    public void testExistentSinger(){
    	//datos de prueba
    	song.setSinger("Luis Fonsi");
    	
    	assertTrue(!song.getSinger().contentEquals(""));
    }
    
    @Test
    public void testNonExistentSinger(){
    	//datos de prueba
    	song.setSinger("");
    	
    	assertTrue(song.getSinger().contentEquals(""));
    }
    
    @Test
    public void testMaximumCharacterSinger(){
    	//datos de prueba
    	song.setSinger("qwertyuiopasdfghjklñzxcvbn"
    			+ "mqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjk"
    			+ "lñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuio"
    			+ "pasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwe"
    			+ "rtyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqw"
    			+ "ertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuio"
    			+ "pasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghj"
    			+ "klñzxcvbnm");
    	
    	assertTrue(song.getSinger().length()>255);
    }
    
    @Test
    public void testPositivePrice(){
    	//datos de prueba
    	song.setPrice(0.01);
    	
    	assertTrue(song.getPrice()>0);
    }
    
    @Test
    public void testFreePrice(){
    	//datos de prueba
    	song.setPrice(0.00);
    	
    	assertTrue(song.getPrice() == 0);
    }
    
    @Test
    public void testNegativePrice(){
    	//datos de prueba
    	song.setPrice(-8.00);
    	
    	assertTrue(song.getPrice() < 0);
    }
    
    @Test
    public void testExistentDate(){
    	//datos de prueba
    	song.setDate("17-11-2017");
    	
    	assertTrue(!song.getDate().contentEquals(""));
    }
    
    @Test
    public void testNonExistentdate(){
    	//datos de prueba
    	song.setDate("");
    	
    	assertTrue(song.getDate().contentEquals(""));
    }
    
}
