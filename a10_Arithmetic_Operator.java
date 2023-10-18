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
public class a10_Arithmetic_Operator {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int num1,num2,result;
        
        System.out.print("Enter first number:");
        num1=input.nextInt();
        
         System.out.print("Enter second number:");
        num2=input.nextInt();
        
        
        result=num1+num2;
        System.out.println(result);
        
          
        result=num1-num2;
        System.out.println(result);
        
          
        double result2=(double)num1/num2;
        System.out.println(result2);
        
          
        result=num1*num2;
        System.out.println(result);
        
          
        result=num1%num2;
        System.out.println(result);
        
        
    }
    
}
