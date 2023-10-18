/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author zzsha
 */
public class a75_sorting_arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> number=new ArrayList<>();
        
        number.add(10);
         number.add(89);
          number.add(-11);
           number.add(-44);
            number.add(25);
            
           Collections.sort(number);
           System.out.println("Ascending order:"+number);
           
           Collections.sort(number,Collections.reverseOrder());
           System.out.println("Descending order:"+number);
           
           
    }
    
}
