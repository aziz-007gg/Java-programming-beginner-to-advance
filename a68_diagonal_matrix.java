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
public class a68_diagonal_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A =new int [3][3];
        int SumOfDiagonal=0;
        int SumOfUpperElement=0;
        int SumOfLowerElement=0;
        System.out.println("Enter elemnts for matrix a:");
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col]=input.nextInt();
            }
            
        }
         for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
               if(row==col){
                 SumOfDiagonal =SumOfDiagonal+A[row][col] ;
                   
               }
            }
            
        }
         System.out.println(SumOfDiagonal);
         for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
               if(row<col){
                 SumOfUpperElement =SumOfUpperElement+A[row][col] ;
                   
               }
            }
            
        }
System.out.println(SumOfUpperElement);
         
         for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
               if(row>col){
                 SumOfLowerElement =SumOfLowerElement+A[row][col] ;
                  
               }
            }
            
        }
 System.out.println(SumOfLowerElement);
    }
}
