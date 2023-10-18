/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.util.Scanner;

/**
 *
 * @author zzsha
 */
public class a63_maximum_minimum_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        
        int [] number=new int[5];
        
        for (int i = 0; i < 5; i++) {
            number[i]=input.nextInt();
        }
        
        int max=number[0];
        
        for (int i = 1; i < 5; i++) {
            if(number[i]>max)
                max=number[i];
        }
        System.out.println("maximum:"+max);
        int min=number[0];
        
        for (int i = 1; i < 5; i++) {
            if(number[i]<min)
                min=number[i];
        }
        System.out.println("minimum:"+min);
    }
    
}
