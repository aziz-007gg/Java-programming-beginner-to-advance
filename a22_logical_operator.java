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
public class a22_logical_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a letter");
        char letter=input.next().charAt(0);
        
        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
            System.out.println("vowel");
        }
      
        else{
            System.out.println("consonent");
        }
    }
    
}
