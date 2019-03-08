package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class RemoveVowelTest {

        RemoveVowel obj;
        @Before
        public void setUp() throws Exception {
             obj = new RemoveVowel();
        }

        @After
        public void tearDown() throws Exception {
            obj = null;
        }

        @Test
        public void vowelsDelete() {
            assertEquals("nd",obj.vowelsDelete("India"));

        }
        @Test
        public  void vowel(){
            assertEquals("ntdStts",obj.vowelsDelete("UnitedStates"));

        }
        @Test
        public  void vowel1(){
        assertEquals("Grmny",obj.vowelsDelete("Germany"));}
        @Test
        public  void vowel2(){
        assertEquals("ygpt",obj.vowelsDelete("Eygpt"));}
        @Test
        public  void vowel3(){
        assertEquals("czchslvk",obj.vowelsDelete("czechoslovakia"));}
    }
