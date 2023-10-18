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
public class a26_switch {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number=input.nextInt();
        
        
        switch(number)
        {
            case 1:{
                System.out.println("one");
                break;
            }
            case 2:{
                System.out.println("two");
                break;
            }
            case 3:{
                System.out.println("three");
                break;
            }
            case 4:{
                System.out.println("four");
                break;
            }
            case 5:{
                System.out.println("five");
                break;
            }
            case 6:{
                System.out.println("six");
                break;
            }
            case 7:{
                System.out.println("seven");
                break;
            }
            case 8:{
                System.out.println("eight");
                break;
            }
            case 9:{
                System.out.println("nine");
                break;
            }
            
            default:{
                System.out.println("Not in range");
                
            }
        }
    }
    
}
