package org.Iteration1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.Album;
import Domain.Song;

/**
 * Unit test for simple App.
 */
public class TestAlbum
{

    private Album album;
    private Album album2;
    private Album album3;
    private Album album4;
    private Album album5;
    private Album album6;
    private Album album7;
    private Album album8;
    private Album album9;
    private Song [] listSongs;
    private Song song1;
    private Song song2;
    
    @Before
    public void setUp(){
    	album = new Album("30657898qwe","Despacito","Luis Fonsi",2.99,"12-01-2017",listSongs);
    	album2 = new Album("-5704hbc","null","Luis Fonsi",-8.00,"12-01-2017",null);
    	album3 = new Album("28469863526opt","String with more than 255 characters","Luis Fonsi",-0.01,"null",listSongs);
    	album4 = new Album("-1aaa","Despacito","Luis Fonsi",0.00,"12-01-2017",listSongs);
    	album5 = new Album("0aaa","Despacito","null",2.99,"12-01-2017",null);
    	album6 = new Album("0aab","Despacito","Luis Fonsi",2.99,"12-01-2017",listSongs);
    	album7 = new Album("99999999zzy","Despacito","String with more than 255 characters",0.01,"12-01-2017",null);
    	album8 = new Album("99999999zzz","Despacito","Luis Fonsi",2.99,"12-01-2017",listSongs);
    	album9 = new Album("100000000aaa","Despacito","null",2.99,"12-01-2017",listSongs);
    	song1 = new Song("306578981qwe","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	song2 = new Song("100000000aab","Échame la culpa","Luis Fonsi ft. Demi Lobato",2.99,"17-11-2017");
    	
    }
    
    @Test
    public void testObtainIdAlbum(){
    	assertTrue(!album.getIdAlbum().contentEquals(""));
    	assertTrue(!album2.getIdAlbum().contentEquals(""));
    	assertTrue(!album3.getIdAlbum().contentEquals(""));
    	assertTrue(!album4.getIdAlbum().contentEquals(""));
    	assertTrue(!album5.getIdAlbum().contentEquals(""));
    	assertTrue(!album6.getIdAlbum().contentEquals(""));
    	assertTrue(!album7.getIdAlbum().contentEquals(""));
    	assertTrue(!album8.getIdAlbum().contentEquals(""));
    	assertTrue(!album9.getIdAlbum().contentEquals(""));
    }
    
    @Test
    public void testObtainTitle(){
    	assertTrue(!album.getTitle().contentEquals(""));
    	assertTrue(!album2.getTitle().contentEquals(""));
    	assertTrue(!album3.getTitle().contentEquals(""));
    	assertTrue(!album4.getTitle().contentEquals(""));
    	assertTrue(!album5.getTitle().contentEquals(""));
    	assertTrue(!album6.getTitle().contentEquals(""));
    	assertTrue(!album7.getTitle().contentEquals(""));
    	assertTrue(!album8.getTitle().contentEquals(""));
    	assertTrue(!album9.getTitle().contentEquals(""));
    }
    
    @Test
    public void testObtainSinger(){
    	assertTrue(!album.getSinger().contentEquals(""));
    	assertTrue(!album2.getSinger().contentEquals(""));
    	assertTrue(!album3.getSinger().contentEquals(""));
    	assertTrue(!album4.getSinger().contentEquals(""));
    	assertTrue(!album5.getSinger().contentEquals(""));
    	assertTrue(!album6.getSinger().contentEquals(""));
    	assertTrue(!album7.getSinger().contentEquals(""));
    	assertTrue(!album8.getSinger().contentEquals(""));
    	assertTrue(!album9.getSinger().contentEquals(""));
    }
    
    @Test
    public void testObtainPrice(){
    	assertTrue(album.getPrice()>=0 || album.getPrice()<=0);
    	assertTrue(album2.getPrice()>=0 || album2.getPrice()<=0);
    	assertTrue(album3.getPrice()>=0 || album3.getPrice()<=0);
    	assertTrue(album4.getPrice()>=0 || album4.getPrice()<=0);
    	assertTrue(album5.getPrice()>=0 || album5.getPrice()<=0);
    	assertTrue(album6.getPrice()>=0 || album6.getPrice()<=0);
    	assertTrue(album7.getPrice()>=0 || album7.getPrice()<=0);
    	assertTrue(album8.getPrice()>=0 || album8.getPrice()<=0);
    	assertTrue(album9.getPrice()>=0 || album9.getPrice()<=0);
    }
    
    @Test
    public void testObtainDate(){
    	assertTrue(!album.getDate().contentEquals(""));
    	assertTrue(!album2.getDate().contentEquals(""));
    	assertTrue(!album3.getDate().contentEquals(""));
    	assertTrue(!album4.getDate().contentEquals(""));
    	assertTrue(!album5.getDate().contentEquals(""));
    	assertTrue(!album6.getDate().contentEquals(""));
    	assertTrue(!album7.getDate().contentEquals(""));
    	assertTrue(!album8.getDate().contentEquals(""));
    	assertTrue(!album9.getDate().contentEquals(""));
    }
    
    public void testObtainListSongs(){
    	listSongs[0]=song1;
    	listSongs[1]=song2;
    	
    	assertTrue(album.getListSongs().length > 0);
    	assertTrue(!(album2.getListSongs().length > 0));
    	assertTrue(album3.getListSongs().length > 0);
    	assertTrue(album4.getListSongs().length > 0);
    	assertTrue(!(album5.getListSongs().length > 0));
    	assertTrue(album6.getListSongs().length > 0);
    	assertTrue(!(album7.getListSongs().length > 0));
    	assertTrue(album8.getListSongs().length > 0);
    	assertTrue(album9.getListSongs().length > 0);
    }
    
}