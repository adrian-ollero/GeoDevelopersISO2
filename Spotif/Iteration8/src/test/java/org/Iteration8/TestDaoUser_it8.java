package org.Iteration8;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Domain.DaoUser_it8;
import Domain.Message;

/**
 * Unit test for simple App.
 */
public class TestDaoUser_it8
{

    private Message message;
    private DaoUser_it8 dao;
    
    @Before
    public void setUp(){
    	message = new Message(5,"FutbolSupporters","escolta15","Have you hear the new song of Luis Fonsi?");
    	dao = new DaoUser_it8();
    }
    
    @Test
    public void testSendMessage(){
    	dao.sendMessage(message);
    	assertTrue(message.getIdMessage() > 0);
    }
    
}