package org.Iteration5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.Album_it3;
import domain.DaoAlbum_it5;
import domain.Song_it3;

/**
 * Unit test for simple App.
 */
public class TestDaoAlbum_it5
{

    private Album_it3 album;
    private DaoAlbum_it5 dao;
    private Song_it3 [] listSongs;
    
    @Before
    public void setUp(){
    	album = new Album_it3("30657898qwe","Despacito","Luis Fonsi",2.99,"12-01-2017",listSongs);
    	dao = new DaoAlbum_it5();
    }
    
    @Test
    public void testDeleteAlbum(){
    	dao.deleteAlbum(album);
    	//variable which will contains in the database.
    	String idAlbum="30657898qwe";
    	assertTrue(album.getIdAlbum().contentEquals(idAlbum));
    }
    
}