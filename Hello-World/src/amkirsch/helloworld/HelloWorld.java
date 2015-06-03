/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amkirsch.helloworld;

public class HelloWorld {

    private String message;

    public HelloWorld() {
        message = "Hello World!";
    }

    public HelloWorld(String msg){
        message = msg;
    }
    
    public String getMessage(){
        return message;
    }
}
