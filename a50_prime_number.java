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
public class a50_prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number=input.nextInt();
        int count=0;
        
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    
}
