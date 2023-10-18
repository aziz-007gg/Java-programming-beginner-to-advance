/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.util.Arrays;

/**
 *
 * @author zzsha
 */
public class a71_arrays_sorting {
    public static void main(String[] args) {
        int [] number=new int[5];
        number[0]=2;
        number[1]=12;
        number[2]=-8;
        number[3]=-19;
        number[4]=50;
     
        Arrays.sort(number);
        
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);
        }
        
        System.out.println("");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+number[i]);
        }
        
        String []name={"aziz","safin","tanzila","arshi","omy"};
       Arrays.sort(name);
        System.out.println("");
        for (int i = 0; i <5; i++) {
            System.out.print(" "+name[i]);
            
        }
    }
    
}
