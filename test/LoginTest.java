/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RengaNayagi
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of validateUser method, of class Login.
     */
    @Test
    public void testValidateUser() {
        System.out.println("validate Investigation Officer");
        String Id = "i1";
        String pwd = "123";
        Login instance = new Login();
        String expResult = "Investigation Officer Login Successfull";
        String result = instance.validateUser(Id, pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("validate Forensic Officer");
        Id = "i2";
        pwd = "123";
        instance = new Login();
        expResult = "Forensic Officer Login Successfull";
        result = instance.validateUser(Id, pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("validate Password");
        Id = "i1";
        pwd = "13";
        instance = new Login();
        expResult = "Invalid password";
        result = instance.validateUser(Id, pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("validate USer Exists");
        Id = "i44";
        pwd = "123";
        instance = new Login();
        expResult = "Invalid user id";
        result = instance.validateUser(Id, pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
