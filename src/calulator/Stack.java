/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author subeg
 */
public class Stack<E> {

    private List<E> list = new ArrayList<E>();  
//    private List<E> dfdf ;

    private int pointer =  -1;
    public int size;
   
   
    

    public void push(E item) {
        list.add(item);
        pointer++;
        size++;
    }

    public E pop() {

        if (pointer > -1) {
            E item = list.remove(pointer);
            pointer--;
            size--;
            return item;
        } else {
            return null;
        }

    }
    
    
    public void display(){
        
        System.out.print("\nStack is:");
        for(E item:list){
            System.out.print(item);
        }
       
    }
}
