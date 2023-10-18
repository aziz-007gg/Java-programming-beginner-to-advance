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
public class a46_series {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int m=1;
        System.out.println("Enter a number:");
        int number=input.nextInt();
        for (int i = 1; i <= number; i=i+2) {
            m=m*i;
        }
        System.out.println(m);
    }
    
}
