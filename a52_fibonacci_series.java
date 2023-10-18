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
public class a52_fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many number:");
        int number=input.nextInt();
        
        int first=0;
        int second=1;
        int fibo;
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i <=number; i++) {
            fibo=first+second;
            
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
            
        }
    }
    
}
