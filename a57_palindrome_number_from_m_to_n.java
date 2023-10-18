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
public class a57_palindrome_number_from_m_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Initial number:");
        int m=input.nextInt();
        
          System.out.println("Enter Ending number:");
        int n=input.nextInt();
       
        int count=0;
        
        for (int i = m; i <=n; i++) {
            int temp=i;
             int sum=0;
            while(temp!=0){
                int r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
                
            }
            if(sum==i){
                System.out.println(sum);
                count++;
            }
        }
        System.out.println(count);
    }
    
}
