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
public class a40_sum_of_all_number_from_m_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter starting number:");
        int m=input.nextInt();
        
        System.out.print("Enter starting number:");
        int n=input.nextInt();
        
         int sum=0;
        
        for (int i = m; i <= n; i++) {
            
            sum=sum+i;
            
        }
        System.out.println(sum);
    }
    
}
