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
        String exp = "2*3+5/(6+7*5^1)+4";  
//        String exp = "5/(6+7*5^8)+4";

//        String exp = "7/(5+2)";
        int expInd = 0;
        int expLength = 0;

        //input the expression
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter a text: ");
//        String input = reader.nextLine();
//reader.close();
//        System.out.println("THe input was " + input);
        expLength = exp.length();
//        System.out.println("size of expression is:" + exp.length());

        //instantiating Stack and Queue
        Stack<String> opStack = new Stack();
        Queue queue = new Queue();

        //converting the infix  expression to post-fix expression
        while (expInd + 1 <= exp.length()) {
            char item = exp.charAt(expInd);
            if (isNumber(item)) {
                String digit = "" + item;
                if (expInd + 1 < exp.length() && isNumber(exp.charAt(expInd + 1))) {
                    digit += exp.charAt(++expInd);
                }
                queue.enque(digit);
            } else if (isOperator(item)) {
                String topItem = opStack.pop();
                
                if (topItem != null) {
                    opStack.push(topItem);
                }
                
                if(item=='(' || topItem==null  ) opStack.push(""+item);
                
                else if (  isSmaller(topItem.charAt(0), item)&& item!=')'    ) {
                    opStack.push("" + item);
                    
                    
                } else if (item==')') {
                    int limit = opStack.size;
                    while (limit > 0) {
                        topItem = opStack.pop();
                        if (topItem.equals("(") ) {
                            break;
                            
                        } else {
                            queue.enque("" + topItem);
                        }
                        limit--;
                    }
                } else {
                    int limit = opStack.size;
                    while (limit > 0) {
                        if ( !isSmaller(topItem.charAt(0), item)) {
                            topItem = opStack.pop();
                            queue.enque(topItem);
                        } else {
                            break;
                        }
                        limit--;
                    }
                    opStack.push("" + item);

                }
            }

            expInd++;

        }

        while (opStack.size > 0) {
            String topItem = opStack.pop();
            queue.enque(topItem);
        }

        queue.display();
        
        //process the post-fix operation
        Stack<Integer> stack = new Stack();
        int qLength = queue.size;
        while(qLength>0){
            
             String item=queue.deque();
             if(isNumber(item.charAt(0))){
                 //push directly in stack
                 stack.push(Integer.parseInt(item));
                
                  
             }else{
                 //push in stack after computing
                 //stack.push( compute(stack.pop(),stack.pop(),item);
             }
             
            qLength--;
        }

    }

    public static boolean isSmaller(char toCheck, char fromCheck) {
        List<Character> order = new ArrayList<Character>();
//        order.add('(');  
//        order.add(' ');
//        order.add(')');
//        order.add(' ');
        order.add('-');
        order.add(' ');
        order.add('+');
        order.add(' ');
        order.add('*');
        order.add(' ');
        order.add('/');
        order.add(' ');
        order.add('^');
        

        int inMain = order.indexOf(toCheck);
        int inCheck = order.indexOf(fromCheck);

        if (inCheck - inMain > 1) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isNumber(char item) {
        if (item == '0' || item == '1' || item == '2' || item == '3' || item == '4' || item == '5' || item == '6' || item == '7' || item == '8' || item == '9') {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isOperator(char item) {
        if (item == '(' || item == ')' || item == '-' || item == '+' || item == '*' || item == '^' || item == '/') {
            return true;
        } else {
            return false;
        }
    }

}
