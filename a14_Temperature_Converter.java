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
public class a14_Temperature_Converter {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter celsius:");
       double celsius=input.nextDouble();
        
        
        double farenheit=1.8*celsius+32;
        
        System.out.println("farenheit:"+farenheit);
    }
    
}
