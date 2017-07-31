/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication001;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nilay
 */
public class FXMLDocumentControllerTest {
    
    public FXMLDocumentControllerTest() {
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
     * Test of open method, of class FXMLDocumentController.
     */
    @Test
    public void testOpen() throws IOException {
        System.out.println("open");
        ActionEvent event = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.open(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class FXMLDocumentController.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        ActionEvent event = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.play(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class FXMLDocumentController.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        ActionEvent event = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.stop(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleButtonAction method, of class FXMLDocumentController.
     */
    @Test
    public void testHandleButtonAction() {
        System.out.println("handleButtonAction");
        ActionEvent event = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.handleButtonAction(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class FXMLDocumentController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
