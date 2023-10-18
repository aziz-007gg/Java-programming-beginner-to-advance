/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author zzsha
 */
public class a69_find_output_of_a_program {
    public static void main(String[] args) {
        int k=0;
        int [][] number=new int[4][5];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                number[row][col]=k;
                k++;
                
            }
            
        }
          for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+number[row][col]);
                
            }
              System.out.println(""); 
        }
        
    }
    
}
