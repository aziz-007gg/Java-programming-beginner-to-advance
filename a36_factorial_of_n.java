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
public class a36_factorial_of_n {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number=input.nextInt();
        
        int result=1;
        
        for (int i = 1; i <= number; i++) {
            
            result=i*result;
            
        }
        System.out.println(result);
    }
    
}
