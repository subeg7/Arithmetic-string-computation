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

    Calulator calc = new Calulator();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String exp = "2*3+5/(6+7*5^2)";
        int expInd = 0;
        int expLength = 0;
        
        
        //input the expression
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a text: ");

//        String input = reader.nextLine();
//        System.out.println("THe input was " + input);
        expLength = exp.length();
        
        //instantiating Stack and Queue
        Stack opStack = new Stack();
        Queue queue = new Queue();

        //parsing the expression
        while(expLength!=0){
            char item = exp.charAt(expInd);
            if(isNumber(item)){
            }else if(isOperator(item)){

            }
            
            expInd++;
            expLength--;
        }
        
        
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

        if (inCheck - inMain > 1) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isNumber(char item){
               if(item == '0' ||item == '1' ||item == '2' ||item == '3' ||item == '4' ||item == '5' ||item == '6' ||item == '7' ||item == '8' ||item == '9')
                   return true;
               else 
                   return false;


    }
    
    public static boolean isOperator(char item){
        if(item == '(' ||item == ')' ||item == '-' ||item == '+' ||item == '*' ||item == '^' ||item == '/' )
                   return true;
               else 
                   return false;
    }
        
}
