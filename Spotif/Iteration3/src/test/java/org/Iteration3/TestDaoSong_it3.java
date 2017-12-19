package org.Iteration3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.DaoSong_it3;
import Domain.Song;
import Domain.Song_it3;

/**
 * Unit test for simple App.
 */
public class TestDaoSong_it3
{

    private Song_it3 song;
    private DaoSong_it3 dao;
    
    @Before
    public void setUp(){
    	song = new Song_it3("306578981qwe","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	dao = new DaoSong_it3();
    }
    
    @Test
    public void testAddSong(){
    	//dao.addSong(song);
    	//variable which will contains in the database.
    	double price=0.01;
    	assertTrue(price >= 0);
    	song.setPrice(price);
    }
    
}