package com.dylan;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest {
    Event event = new Event();
    @Before
    public void setUp() throws Exception {
        System.out.println("setting up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("cleaning up");
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void basicTest() throws Exception {
        System.out.println("basic test");
        event.name = "Earl";
        event.action = "Eating";
        assertTrue(EventLog.addEvent(event));
    }
    @Test
    public void nameNull() throws Exception {
        System.out.println("name null");
        event.name = null;
        event.action = "Eating";
        thrown.expect(IllegalArgumentException.class);
        assertFalse(EventLog.addEvent(event));

    }
    @Test
    public void actionNull() throws Exception {
        System.out.println("action null");
        event.name = "Earl";
        event.action = null;
        thrown.expect(IllegalArgumentException.class);
        assertFalse(EventLog.addEvent(event));
    }
    @Test
    public void bothNull() throws Exception {
        System.out.println("both null");
        event.name = null;
        event.action = null;
        thrown.expect(IllegalArgumentException.class);
        assertFalse(EventLog.addEvent(event));
    }
    @Test
    public void faceTwoFace() throws Exception {
        System.out.println("face");
        event.name = "frank";
        event.action = "Face2Face";
        assertTrue(EventLog.addEvent(event));
    }
    @Test
    public void phoneCall() throws Exception {
        System.out.println("phone");
        event.name = "Stewart";
        event.action = "PhoneCall";
        assertTrue(EventLog.addEvent(event));
        }
    @Test
    public void textMessaging() throws Exception {
        System.out.println("text");
        event.name = "Alex";
        event.action = "TextMessaging";
        assertTrue(EventLog.addEvent(event));
    }
    @Test
    public void unknown() throws Exception {
        System.out.println("unknown");
        event.name = "Pokemon";
        event.action = "Unknown";
        assertTrue(EventLog.addEvent(event));
    }
    @Test
    public void wrongAction() throws Exception {
        System.out.println("Wrong Action");
        event.name = "Larry";
        event.action = "WhatIWant";
        thrown.expect(IllegalArgumentException.class);
        assertFalse(EventLog.addEvent(event));
    }




}