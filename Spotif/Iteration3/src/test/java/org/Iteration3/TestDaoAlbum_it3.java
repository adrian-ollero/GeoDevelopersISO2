package org.Iteration3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.Album_it3;
import domain.DaoAlbum_it3;
import domain.Song_it3;

/**
 * Unit test for simple App.
 */
public class TestDaoAlbum_it3
{

    private Album_it3 album;
    private DaoAlbum_it3 dao;
    private Song_it3 [] listSongs;
    
    @Before
    public void setUp(){
    	album = new Album_it3("30657898qwe","Despacito","Luis Fonsi",2.99,"12-01-2017",listSongs);
    	dao = new DaoAlbum_it3();
    }
    
    @Test
    public void testAddAlbum(){
    	dao.changePrice(album);
    	//variable which will contains in the database.
    	double price=0.01;
    	assertTrue(price >= 0);
    	album.setPrice(price);
    }
    
}