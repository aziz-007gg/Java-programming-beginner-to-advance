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
public class a61_sum_of_array {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0;
        double avg;
        int [] number=new int [5];
        
        for (int i = 0; i < 5; i++) {
           number[i]=input.nextInt();
            
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
        for (int i = 0; i < 5; i++) {
            sum=sum+number[i];
        }
        System.out.println("sum"+sum);
        
        avg=sum/number.length;
        System.out.println("Average:"+avg);
    }
    
}
