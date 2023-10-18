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
public class a17_control_statement {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number;
        number=input.nextInt();
        
        if(number>0){
            
            System.out.println("positive number");
        }
        else if(number<0){
            
            System.out.println("negative number");
            
        }
        else{
            System.out.println("nutral number");
        }
    }
}
