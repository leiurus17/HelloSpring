package mangitsi.hellospring;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giacomo Mariani
 */
public class HelloWorld {
    private String message;
    
    public void setMessage(String meggage){
        this.message = meggage;
    }
    
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
