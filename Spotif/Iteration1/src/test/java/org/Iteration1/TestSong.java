package org.Iteration1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.Song;

/**
 * Unit test for simple App.
 */
public class TestSong
{

    private Song song;
    private Song song2;
    private Song song3;
    private Song song4;
    private Song song5;
    private Song song6;
    private Song song7;
    private Song song8;
    private Song song9;
    
    @Before
    public void setUp(){
    	song = new Song("306578981qwe","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	song2 = new Song("5704hbc","null","String with more than 255 characters",-8.00,"null");
    	song3 = new Song("28469863526opt","String with more than 255 characters","null",-0.01,"12-01-2017");
    	song4 = new Song("99999999zzz","Despacito","Luis Fonsi ft. Dady Yankee",0.00,"12-01-2017");
    	song5 = new Song("100000000aaa","Despacito","Luis Fonsi ft. Dady Yankee",0.01,"12-01-2017");
    	song6 = new Song("100000000aab","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"null");
    	song7 = new Song("999999999zzy","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	song8 = new Song("999999999zzz","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	song9 = new Song("1000000000aaa","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    }
    
    @Test
    public void testObtainIdSong(){
    	assertTrue(!song.getIdSong().contentEquals(""));
    	assertTrue(!song2.getIdSong().contentEquals(""));
    	assertTrue(!song3.getIdSong().contentEquals(""));
    	assertTrue(!song4.getIdSong().contentEquals(""));
    	assertTrue(!song5.getIdSong().contentEquals(""));
    	assertTrue(!song6.getIdSong().contentEquals(""));
    	assertTrue(!song7.getIdSong().contentEquals(""));
    	assertTrue(!song8.getIdSong().contentEquals(""));
    	assertTrue(!song9.getIdSong().contentEquals(""));
    }
    
    @Test
    public void testObtainTitle(){
    	assertTrue(!song.getTitle().contentEquals(""));
    	assertTrue(!song2.getTitle().contentEquals(""));
    	assertTrue(!song3.getTitle().contentEquals(""));
    	assertTrue(!song4.getTitle().contentEquals(""));
    	assertTrue(!song5.getTitle().contentEquals(""));
    	assertTrue(!song6.getTitle().contentEquals(""));
    	assertTrue(!song7.getTitle().contentEquals(""));
    	assertTrue(!song8.getTitle().contentEquals(""));
    	assertTrue(!song9.getTitle().contentEquals(""));
    }
    
    @Test
    public void testObtainSinger(){
    	assertTrue(!song.getSinger().contentEquals(""));
    	assertTrue(!song2.getSinger().contentEquals(""));
    	assertTrue(!song3.getSinger().contentEquals(""));
    	assertTrue(!song4.getSinger().contentEquals(""));
    	assertTrue(!song5.getSinger().contentEquals(""));
    	assertTrue(!song6.getSinger().contentEquals(""));
    	assertTrue(!song7.getSinger().contentEquals(""));
    	assertTrue(!song8.getSinger().contentEquals(""));
    	assertTrue(!song9.getSinger().contentEquals(""));
    }
    
    @Test
    public void testObtainPrice(){
    	assertTrue(song.getPrice()>=0 || song.getPrice()<=0);
    	assertTrue(song2.getPrice()>=0 || song2.getPrice()<=0);
    	assertTrue(song3.getPrice()>=0 || song3.getPrice()<=0);
    	assertTrue(song4.getPrice()>=0 || song4.getPrice()<=0);
    	assertTrue(song5.getPrice()>=0 || song5.getPrice()<=0);
    	assertTrue(song6.getPrice()>=0 || song6.getPrice()<=0);
    	assertTrue(song7.getPrice()>=0 || song7.getPrice()<=0);
    	assertTrue(song8.getPrice()>=0 || song8.getPrice()<=0);
    	assertTrue(song9.getPrice()>=0 || song9.getPrice()<=0);
    }
    
    @Test
    public void testObtainDate(){
    	assertTrue(!song.getDate().contentEquals(""));
    	assertTrue(!song2.getDate().contentEquals(""));
    	assertTrue(!song3.getDate().contentEquals(""));
    	assertTrue(!song4.getDate().contentEquals(""));
    	assertTrue(!song5.getDate().contentEquals(""));
    	assertTrue(!song6.getDate().contentEquals(""));
    	assertTrue(!song7.getDate().contentEquals(""));
    	assertTrue(!song8.getDate().contentEquals(""));
    	assertTrue(!song9.getDate().contentEquals(""));
    }
    
}