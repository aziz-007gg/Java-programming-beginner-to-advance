/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.util.ArrayList;

/**
 *
 * @author zzsha
 */
public class a73_arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        
        System.out.println("Elements:"+number);
        
        boolean x=number.isEmpty();
        System.out.println("number is empty:"+x);
        
        boolean y=number.contains(50);
        System.out.println("number contains 50:"+y);
        
        int w=number.indexOf(70);
        System.out.println("Index of 70:"+w);
        
        number.set(0, 10);
        System.out.println("after setting:"+number);
        
        int z=number.get(3);
        System.out.println("Index 3 contains:"+z);
        
        number.clear();
        System.out.println(number);

    }
}
