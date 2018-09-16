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
public class Queue {

    private List<String> list = new ArrayList<String>();
    private int tail = -1;
    private int head = 0;
    private int size = 0;

    public void enque(String item) {

        tail++;
        size++;

        list.add(item);
    }

    public String deque() {
        if (size > 0) {
            size--;
            String item = list.remove(0);
            return item;
            
        } else {
            return "null";
        }

    }
}
