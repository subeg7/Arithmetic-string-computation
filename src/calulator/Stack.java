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
public class Stack {

    private List<Character> list = new ArrayList<Character>();
    private int pointer = -1;

    public void push(char item) {
        list.add(item);
        pointer++;
    }

    public char pop() {

        if (pointer > -1) {
            char item = list.remove(pointer);
            pointer--;
            return item;
        } else {
            return 'n';
        }

    }
}
