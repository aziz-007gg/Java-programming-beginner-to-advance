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
public class a24_logical_operator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you love java?");
        
        char answer=input.next().charAt(0);
        
        if(answer=='y' || answer=='Y')
        {
            System.out.println("Yes i love java");
        }
        
        else if(answer=='n' || answer=='N')
        {
            System.out.println("no i dont love java");
        }
    }
    
}
