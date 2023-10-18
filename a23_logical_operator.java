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
public class a23_logical_operator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char letter;
        letter=input.next().charAt(0);
        
        if(letter>='a' && letter<='z')
            
        {
            System.out.println("small letter");
        }
        else if(letter>='A' && letter<='Z')
        {
            System.out.println("capital letter");
        }
        else{
            System.out.println("not a letterA");
        }
        
    }
    
}
