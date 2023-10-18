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
public class a11_arithmetic_operators {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         int price=1800;
        System.out.println("The price of the phone:"+price);
       
        
        System.out.print("Enter number of installment you want:");
        int installment=input.nextInt();
        
        
        double installmentpermonth=(double)price/installment;
        
        System.out.println("installment per month:"+installmentpermonth+"$");
        
        
    }
    
}
