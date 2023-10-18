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
public class a25_logical_operator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Have you completed your masters?");
        char masters=input.next().charAt(0);
        
        System.out.println("Are you Fluent in English?");
        char English=input.next().charAt(0);
        
        if((masters=='y' ||masters=='Y') && (English=='y' || English=='Y') )
        {
            System.out.println("You are elligible for the jon");
        }
        else if((masters=='n' ||masters=='N') && (English=='n' || English=='N') )
        {
            System.out.println("You are not elligible for the jon");
        }
        else{
            System.out.println("You are not elligible for the jon");
        }
        
    }
    
}
