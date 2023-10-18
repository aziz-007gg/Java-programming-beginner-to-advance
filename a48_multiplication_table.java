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
public class a48_multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        int number=input.nextInt();
        for (int i = 1; i <= 10; i++) {
            
            int mul=number*i;
            System.out.println(number+"*"+i+"="+mul);
            
        }
    }
    
}
