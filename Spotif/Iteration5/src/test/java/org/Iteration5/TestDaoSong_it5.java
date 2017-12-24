package org.Iteration5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.DaoSong_it5;
import domain.Song_it3;

/**
 * Unit test for simple App.
 */
public class TestDaoSong_it5
{

    private Song_it3 song;
    private DaoSong_it5 dao;
    
    @Before
    public void setUp(){
    	song = new Song_it3("306578981qwe","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	dao = new DaoSong_it5();
    }
    
    @Test
    public void testDeleteSong(){
    	dao.deleteSong(song);
    	//variable which will contains in the database.
    	String idSong="306578981qwe";
    	assertTrue(song.getIdSong().contentEquals(idSong));
    }
    
}