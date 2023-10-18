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
public class a49_Multiple_multiplication_table_from_m_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial  number:");
        int m=input.nextInt();
        
        System.out.println("Enter ending  number:");
        int n=input.nextInt();
        
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                
             int mul=i*j;
                
                System.out.println(i+"*"+j+"="+mul);
                
            }
             System.out.println("");
        }
       
    }
    
}
