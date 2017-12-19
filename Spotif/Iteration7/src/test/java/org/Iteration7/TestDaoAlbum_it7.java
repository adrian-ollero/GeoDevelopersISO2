package org.Iteration7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.DaoAlbum_it7;
import Domain.Song_it3;
import Domain.Album_it3;

/**
 * Unit test for simple App.
 */
public class TestDaoAlbum_it7
{

    private Album_it3 album;
    private DaoAlbum_it7 dao;
    private Song_it3 [] listSongs;
    
    @Before
    public void setUp(){
    	album = new Album_it3("30657898qwe","Despacito","Luis Fonsi",2.99,"12-01-2017",listSongs);
    	dao = new DaoAlbum_it7();
    }
    
    @Test
    public void testSearchByTitle(){
    	String title=album.getTitle();
    	dao.searchAlbumTitle(title);
    	//variable which will contains in the database.
    	assertTrue(album.getTitle().contentEquals(title));
    }
    
    @Test
    public void testSearchBySinger(){
    	String singer=album.getSinger();
    	dao.searchAlbumSinger(singer);
    	//variable which will contains in the database.
    	assertTrue(album.getSinger().contentEquals(singer));
    }
    
}