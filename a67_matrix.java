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
public class a67_matrix {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [][] a=new int[2][3];
        int [][] b=new int[2][3];
        int [][] c=new int[2][3];
        System.out.println("Enter elements for a:");
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("a[%d][%d]=",row,col);
                
                a[row][col]=input.nextInt();
                
            }
            
        }
        
        System.out.println("Enter elements for b:");
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("b[%d][%d]=",row,col);
                
                b[row][col]=input.nextInt();
                
            }
            
        }
        System.out.println("");
        
        System.out.print("A=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                System.out.print("\t"+a[row][col]);
                
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.print("B=");
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                System.out.print("\t"+b[row][col]);
                
            }
            System.out.println("");
        }
         System.out.println("");
         System.out.print("A+b=");
         for (int row = 0; row < 2; row++) {
             for (int col = 0; col < 3; col++) {
                 
                 c[row][col]=a[row][col]+b[row][col];
                 System.out.print("\t"+c[row][col]);
             }
             System.out.println("");
        }
    }
}
