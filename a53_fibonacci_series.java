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
public class a53_fibonacci_series {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number to find:");
        int number=input.nextInt();
        
        int first=0;
        int second=1;
        int fibo=0;
        
       
        
        for (int i = 3; i <=number; i++) {
            fibo=first+second;
            
            
            first=second;
            second=fibo;
            
        }
        System.out.print("find the nth fibonacci number:"+fibo);
    }
}
