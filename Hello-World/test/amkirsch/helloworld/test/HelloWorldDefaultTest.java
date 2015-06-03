/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amkirsch.helloworld.test;

import org.junit.Test;
import static org.junit.Assert.*;
import amkirsch.helloworld.HelloWorld;
/**
 *
 * @author amkirsch
 */
public class HelloWorldDefaultTest {
    
    public HelloWorldDefaultTest() {
        
    }
    
    @Test
    public void SmokeScreen(){
        HelloWorld hw = new HelloWorld("Hallo World!");
        assertEquals(hw.getMessage(), "Hallo World!");
        
        HelloWorld hwDefault = new HelloWorld();
        assertEquals(hwDefault.getMessage(), "Hello World!");
    }
}
