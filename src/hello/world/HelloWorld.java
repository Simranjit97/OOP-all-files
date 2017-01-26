/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.util.Scanner;

/**
 *
 * @author simra
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("hello world\n\n");
        
        System.out.print("What is your name ?");
        
        Scanner keyboard = new Scanner(System.in);
        String userName = keyboard.nextLine();
        
        System.out.print("Hello" + userName);
    }
    
}
