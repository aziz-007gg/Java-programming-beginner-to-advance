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
public class a74_arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(10);
        number1.add(40);
        number1.add(50);
        number1.add(30);
        number1.add(20);
        System.out.println("Number1:"+number1);
         number2.add(80);
        number2.add(90);
        number2.add(70);
        number2.add(20);
        number2.add(60);
        
        System.out.println("Number2:"+number2);
        number3.addAll(number1);
        System.out.println("Number3:"+number3);
        
        boolean x=number1.equals(number3);
        System.out.println("number1 is equals to number3:"+x);
        
        int size=number1.size();
        System.out.println("size of number1:"+size);

    }
}
