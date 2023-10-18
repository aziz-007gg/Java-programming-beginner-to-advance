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
public class a58_armstrong_number {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();
        int sum=0;
        int temp=number;
        
        while(temp!=0){
            int r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        
        if(sum==number){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
    
}
