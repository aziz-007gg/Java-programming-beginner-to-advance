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
public class a21_vowel_consonent {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a letter");
        char letter=input.next().charAt(0);
        
        if(letter=='a'){
            System.out.println("vowel");
        }
        else if (letter=='e'){
            System.out.println("vowel");
        }
        else if (letter=='i'){
            System.out.println("vowel");
        }
        else if (letter=='o'){
            System.out.println("vowel");
        }
        else if (letter=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("Consonent");
        }
        
    }
    
}
