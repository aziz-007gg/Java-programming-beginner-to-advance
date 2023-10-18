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
public class a65_find_days_using_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String [] days={"satruday","sunday","monday","tuesday","wednesday","thursday","friday"};
        System.out.println("Enter days(1-7):");
        int number=input.nextInt();
        
        for (int i = 0; i < days.length; i++) {
            if(number==i+1){
                System.out.println(days[i]);
                
            }
            
        }
    }
    
        
}
