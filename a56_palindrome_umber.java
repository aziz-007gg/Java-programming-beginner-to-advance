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
public class a56_palindrome_umber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check whether it is palindorme or not:");
        int number=input.nextInt();
        int sum=0;
        int temp=number;
        
        while(temp!=0){
            int r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
if(sum==number){
    System.out.println("palindrome number");
}
else{
        System.out.println("Not a palindorme number");
}
    }
    
}
