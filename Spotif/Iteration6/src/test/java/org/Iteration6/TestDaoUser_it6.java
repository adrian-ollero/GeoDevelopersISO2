package org.Iteration6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.DaoUser_it6;
import Domain.User;

/**
 * Unit test for simple App.
 */
public class TestDaoUser_it6
{

    private User user;
    private DaoUser_it6 dao;
    
    @Before
    public void setUp(){
    	user = new User("escolta15","escoltaSpotif");
    	dao = new DaoUser_it6();
    }
    
    @Test
    public void testDeleteUser(){
    	dao.deleteUser(user);
    	//variable which will contains in the database.
    	String user_name="escolta15";
    	assertTrue(user.getUser().contentEquals(user_name));
    }
    
}