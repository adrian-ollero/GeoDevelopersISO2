package org.Iteration1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.DaoSong;
import Domain.Song;

/**
 * Unit test for simple App.
 */
public class TestDaoSong
{

    private Song song;
    private DaoSong dao;
    
    @Before
    public void setUp(){
    	song = new Song("306578981qwe","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	dao = new DaoSong();
    }
    
    @Test
    public void testAddSong(){
    	dao.addSong(song);
    	//variable which will contains in the database.
    	String idSong="100000000aab";
    	assertTrue(!(song.getIdSong().contentEquals(idSong)));
    }
    
}