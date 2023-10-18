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
public class a9_get_user_input {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
         Scanner input2=new Scanner(System.in);
        
        int id,price;
        String category,title,description;
        
        System.out.print("Enter ID:");
        id=input.nextInt();
        
        System.out.print("Enter price:");
        price=input.nextInt();
        
        System.out.print("Enter title:");
        title=input2.nextLine();
        
        System.out.print("Enter category:");
        category=input2.nextLine();
        
        System.out.print("Enter description:");
        description=input2.nextLine();
        
        
        System.out.println(id);
        System.out.println(price);
        System.out.println(title);
        System.out.println(category);
        System.out.println(description);
        
        
    }
    
}
