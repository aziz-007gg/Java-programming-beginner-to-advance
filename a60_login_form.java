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
public class a60_login_form {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        for (int i = 1; i <=3; i++) {
            
            System.out.print("Enter user name:");
            String name=input1.nextLine();
            
            System.out.print("Enter password:");
            int pass=input2.nextInt();
            
            if("Abdur Rob Aziz".equals(name) && pass==123)
            {
                System.out.println("log in succesfull");
                break;
            }
            else{
                System.out.println("incorrect password");
            }
                
            
        }
    }
    
}
