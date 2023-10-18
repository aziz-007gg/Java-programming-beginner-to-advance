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
public class a55_reverse_a_number {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        int number=input.nextInt();
        int sum=0;
        int temp=number;
        while(temp!=0){
            int r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println("reverse number"+sum);
    }
    
}
