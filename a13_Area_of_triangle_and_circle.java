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
public class a13_Area_of_triangle_and_circle {
    public static void main(String[] args) {
        
        int base,height;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base:");
        base=input.nextInt();
        
        System.out.println("Enter height:");
        height=input.nextInt();
        
        double area=.5*(double)height*base;
        
        System.out.println("area is:"+area);
       
    }
    
}
