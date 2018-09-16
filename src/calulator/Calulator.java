/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author subeg
 */
public class Calulator {

    Calulator calc  = new Calulator();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //input the expression
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a text: ");
//        String input = reader.nextLine();
//        System.out.println("THe input was " + input);

        //instantiating Stack and Queue
        Stack opStack = new Stack();
        Queue queue = new Queue();

        //parsing the expression
        System.out.println(isSmaller('-','+') );
        reader.close();
    }

    public static boolean isSmaller(char toCheck, char fromCheck) {
        List<Character> order = new ArrayList<Character>();

        order.add(')');
        order.add(' ');
        order.add('-');
        order.add('+');
        order.add(' ');
        order.add('*');
        order.add('/');
        order.add(' ');
        order.add('^');        
        order.add(' ');
        order.add('(');

        
        int inMain = order.indexOf(toCheck);
        int inCheck = order.indexOf(fromCheck);
        
        if(inCheck-inMain>1) return true;
        else return false;


    }

}
