/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.tuoppi.jenkinstest.MyTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tuoppi
 */
public class TestTest {
    
    private MyTest test;
    
    public TestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        test = new MyTest();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testTosi() {
        assertTrue(test.tosi());
    }
    
}
