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
    private User user2;
    private User user3;
    
    @Before
    public void setUp(){
    	user = new User("escolta15","escoltaSpotif");
    	user2 = new User("null","escoltaSpotif");
    	user3 = new User("String with more than 255 characters","null");
    }
    
    /*@Test
    public void testObatainUser(){
    	assertTrue(!user.getUser().contentEquals(""));
    	assertTrue(!user2.getUser().contentEquals(""));
    	assertTrue(!user3.getUser().contentEquals(""));
    }
    
    @Test
    public void testObtainPassword(){
    	assertTrue(!user.getPassword().contentEquals(""));
    	assertTrue(!user2.getPassword().contentEquals(""));
    	assertTrue(!user3.getPassword().contentEquals(""));
    }
    
    @Test
    public void testRead(){
    	assertTrue(!user.getUser().contentEquals(""));
    	assertTrue(!user.getPassword().contentEquals(""));
    	assertTrue(!user2.getUser().contentEquals(""));
    	assertTrue(!user2.getPassword().contentEquals(""));
    	assertTrue(!user3.getUser().contentEquals(""));
    	assertTrue(!user3.getPassword().contentEquals(""));
    }
    
    @Test
    public void testInsert(){
    	assertTrue(!user.getUser().contentEquals(""));
    	assertTrue(!user.getPassword().contentEquals(""));
    	assertTrue(!user2.getUser().contentEquals(""));
    	assertTrue(!user2.getPassword().contentEquals(""));
    	assertTrue(!user3.getUser().contentEquals(""));
    	assertTrue(!user3.getPassword().contentEquals(""));
    }*/
    
}