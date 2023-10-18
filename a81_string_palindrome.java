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
public class a81_string_palindrome {

    public static void main(String[] args) {
   
       String s1="Nun";
        StringBuffer sb=new StringBuffer(s1);
        String s2=sb.reverse().toString();
        
      if(s2.equalsIgnoreCase(s2))
        {
            System.out.println("Palindore");
        }
        else{
            System.out.println("not");
        }
        
     
    }

}
