/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chris
 */
public class MatchTest {
    
    public MatchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Match.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Match instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playMatch method, of class Match.
     */
    @Test
    public void testPlayMatch_0args() {
        System.out.println("playMatch");
        Match instance = null;
        Player expResult = null;
        Player result = instance.playMatch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playMatch method, of class Match.
     */
    @Test
    public void testPlayMatch_boolean() {
        System.out.println("playMatch");
        boolean silent = false;
        Match instance = null;
        Player expResult = null;
        Player result = instance.playMatch(silent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playGame method, of class Match.
     */
    @Test
    public void testPlayGame() {
        System.out.println("playGame");
        Match instance = null;
        Player expResult = null;
        Player result = instance.playGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of _sleep method, of class Match.
     */
    @Test
    public void test_sleep() {
        System.out.println("_sleep");
        int t = 0;
        Match._sleep(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
