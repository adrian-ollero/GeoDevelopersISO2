package org.Iteration8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.Message;

/**
 * Unit test for simple App.
 */
public class TestMessage
{

    private Message message;
    private Message message2;
    private Message message3;
    private Message message4;
    private Message message5;
    private Message message6;
    
    @Before
    public void setUp(){
    	message = new Message(5,"FutbolSupporters","escolta15","Have you hear the new song of Luis Fonsi?");
    	message2 = new Message(-5,"FutbolSupporters","escolta15","Have you hear the new song of Luis Fonsi?");
    	message3 = new Message(-1,"FutbolSupporters","escolta15","Have you hear the new song of Luis Fonsi?");
    	message4 = new Message(0,"FutbolSupporters","escolta15","Have you hear the new song of Luis Fonsi?");
    	message5 = new Message(1,"FutbolSupporters","escolta15","Have you hear the new song of Luis Fonsi?");
    	message6 = new Message(1456789347,"FutbolSupporters","escolta15","Have you hear the new song of Luis Fonsi?");
    }
    
    @Test
    public void testObtainIdMessage(){
    	assertTrue(message.getIdMessage() >= 0 || message.getIdMessage() <= 0);
    	assertTrue(message2.getIdMessage() >= 0 || message2.getIdMessage() <= 0);
    	assertTrue(message3.getIdMessage() >= 0 || message3.getIdMessage() <= 0);
    	assertTrue(message4.getIdMessage() >= 0 || message4.getIdMessage() <= 0);
    	assertTrue(message5.getIdMessage() >= 0 || message5.getIdMessage() <= 0);
    	assertTrue(message6.getIdMessage() >= 0 || message6.getIdMessage() <= 0);
    }
    
    @Test
    public void testObtainSender(){
    	assertTrue(!message.getSender().contentEquals(""));
    	assertTrue(!message2.getSender().contentEquals(""));
    	assertTrue(!message3.getSender().contentEquals(""));
    	assertTrue(!message4.getSender().contentEquals(""));
    	assertTrue(!message5.getSender().contentEquals(""));
    	assertTrue(!message6.getSender().contentEquals(""));
    }
    
    @Test
    public void testObtainReceiver(){
    	assertTrue(!message.getReceiver().contentEquals(""));
    	assertTrue(!message2.getReceiver().contentEquals(""));
    	assertTrue(!message3.getReceiver().contentEquals(""));
    	assertTrue(!message4.getReceiver().contentEquals(""));
    	assertTrue(!message5.getReceiver().contentEquals(""));
    	assertTrue(!message6.getReceiver().contentEquals(""));
    }
    
    @Test
    public void testObtainDate(){
    	assertTrue(!message.getDescription().contentEquals(""));
    	assertTrue(!message2.getDescription().contentEquals(""));
    	assertTrue(!message3.getDescription().contentEquals(""));
    	assertTrue(!message4.getDescription().contentEquals(""));
    	assertTrue(!message5.getDescription().contentEquals(""));
    	assertTrue(!message6.getDescription().contentEquals(""));
    }
    
    @Test
    public void testExistentSender(){
    	//datos de prueba
    	message.setSender("MadridSupporters");
    	
    	assertTrue(!message.getSender().contentEquals(""));
    }
    
    @Test
    public void testExistentReceiver(){
    	//datos de prueba
    	message.setReceiver("uclmCool");
    	
    	assertTrue(!message.getReceiver().contentEquals(""));
    }
    
    @Test
    public void testExistentDescription(){
    	//datos de prueba
    	message.setDescription("There is a new song of Luis Fonsi");
    	
    	assertTrue(!message.getDescription().contentEquals(""));
    }
    
}