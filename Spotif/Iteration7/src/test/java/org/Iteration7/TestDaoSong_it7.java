package org.Iteration7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.DaoSong_it7;
import Domain.Song_it3;

/**
 * Unit test for simple App.
 */
public class TestDaoSong_it7
{

    private Song_it3 song;
    private DaoSong_it7 dao;
    
    @Before
    public void setUp(){
    	song = new Song_it3("306578981qwe","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	dao = new DaoSong_it7();
    }
    
    @Test
    public void testSearchByTitle(){
    	String title=song.getTitle();
    	dao.searchSongTitle(title);
    	//variable which will contains in the database.
    	assertTrue(song.getTitle().contentEquals(title));
    }
    
    @Test
    public void testSearchBySinger(){
    	String singer=song.getSinger();
    	dao.searchSongSinger(singer);
    	//variable which will contains in the database.
    	assertTrue(song.getSinger().contentEquals(singer));
    }
    
}