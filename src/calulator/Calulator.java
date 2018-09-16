/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulator;

import java.util.Scanner;

/**
 *
 * @author subeg
 */
public class Calulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //input the expression
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter a text: ");
        String input = reader.nextLine();
        System.out.println("THe input was " + input);
        
        //parsing the expression
        
        reader.close();
    }

}
