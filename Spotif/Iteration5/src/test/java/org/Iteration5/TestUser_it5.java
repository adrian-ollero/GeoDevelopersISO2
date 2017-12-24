package org.Iteration5;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import domain.Song_it3;
import domain.User_it5;

/**
 * Unit test for simple App.
 */
public class TestUser_it5
{

    private User_it5 user;
    private ArrayList<Song_it3> songs;
    private Song_it3 song1;
    private Song_it3 song2;
    
    @Before
    public void setUp(){
    	song1 = new Song_it3("306578981qwe","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017");
    	song2 = new Song_it3("100000000aab","Échame la culpa","Luis Fonsi ft. Demi Lobato",2.99,"17-11-2017");
    	user = new User_it5("escolta15","escoltaSpotif",songs);
    	user.getListSongs().add(song1);
    	user.getListSongs().add(song2);
    }
    
    @Test
    public void testDeleteSongs(){
    	String idSong="306578981qwe";
    	user.deleteSong(idSong);
    	assertTrue(user.getListSongs().size() > 0);
    }
    
}