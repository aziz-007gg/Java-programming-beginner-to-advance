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
public class a20_if_elseif_else_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 9:");
        int number=input.nextInt();
        
        if(number==0){
            System.out.println("zero");
        }
        else if (number==1){
            System.out.println("one");
        }
        else if (number==2){
            System.out.println("two");
        }
        else if (number==3){
            System.out.println("three");
        }
        else if (number==4){
            System.out.println("four");
        }
        else if (number==5){
            System.out.println("five");
        }
        else if (number==6){
            System.out.println("six");
        }
        else if (number==7){
            System.out.println("seven");
        }
        else if (number==8){
            System.out.println("eight");
        }
        else if (number==9){
            System.out.println("nine");
        }
        else{
            System.out.println("not in range");
        }
    }
}
