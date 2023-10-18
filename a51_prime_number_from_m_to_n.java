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
public class a51_prime_number_from_m_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter statring number:");
        int m=input.nextInt();
        
        System.out.println("Enter ending number:");
        int n=input.nextInt();
        
        
        int count=0;
        int total_prime=0;
        
        for (int i = m; i <=n; i++) {
            for (int j = 2; j < i-1; j++) {
                
                if(i%j==0){
                    count++;
                    break;
                }
                
            }
            if(count==0){
                System.out.println(i);
                total_prime++;
                
            }
           count=0; 
            }
        System.out.println("number of prime numbers:"+total_prime);
        }
    
    }

    

