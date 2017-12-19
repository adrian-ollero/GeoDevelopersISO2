package org.Iteration2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.User;

/**
 * Unit test for simple App.
 */
public class TestUser
{

    private User user;
    
    @Before
    public void setUp(){
    	user = new User("escolta15","escoltaSpotif");
    }
    
    @Test
    public void testObatainUser(){
    	assertTrue(!user.getUser().contentEquals(""));
    }
    
    @Test
    public void testObtainPassword(){
    	assertTrue(!user.getPassword().contentEquals(""));
    }
    
    @Test
    public void testRead(){
    	assertTrue(!user.getUser().contentEquals(""));
    	assertTrue(!user.getPassword().contentEquals(""));
    }
    
    @Test
    public void testInsert(){
    	assertTrue(!user.getUser().contentEquals(""));
    	assertTrue(!user.getPassword().contentEquals(""));
    }
    
}