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
public class a19_even_odd {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number;
        number=input.nextInt();
        
        
        if (number%2==0){
            System.out.println("even number");
        }
        else if(number%2!=0){
            System.out.println("odd number");
        }
        else{
            System.out.println("not a number");
        }
    }
    
}
