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
public class a28_conditional_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two number:");
        int number1=input.nextInt();
        int number2=input.nextInt();
        
        
        int large=(number1>number2)?number1:number2;
        System.out.println("large="+large);
        
    }
    
}
