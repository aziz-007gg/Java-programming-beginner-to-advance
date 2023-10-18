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
public class a27_switch {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("selcet 1 to choose bengali");
        System.out.println("selcet 2 to choose English");
        System.out.println("selcet 3 to choose Hindi");
        System.out.println("selcet 4 to choose Urdu");
        
        System.out.println("");
        
        
        System.out.print("Enter a number from above to choose language:");
        int number=input.nextInt();
        
        switch(number){
            
            case 1:{
                System.out.println("You choosed Bengali");
                break;
            }
            case 2:{
                System.out.println("You choosed English");
                break;
            }
            case 3:{
                System.out.println("You choosed Hindi");
                break;
            }
            case 4:{
                System.out.println("You choosed Urdu");
                break;
            }
            default:
            {
                System.out.println("You have selected invalid number");
            }
        }
    }
    
}
