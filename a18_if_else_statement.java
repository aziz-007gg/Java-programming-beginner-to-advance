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
public class a18_if_else_statement {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        
        int age;
        age=input.nextInt();
        
        
        if(age>=18){
            System.out.println("Elligible for voting");
        }
        else{
            System.out.println("not a voter");
        }
    }
    
}
