/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author zzsha
 */
public class a78_string {
    
    public static void main(String[] args) {
        
        String name="Bangladesh is my country";
        System.out.println(name);
        String w="   Bangladesh is my country   ";
        System.out.println(w.trim());
        int x=name.codePointAt(0);
        System.out.println("asci value:"+x);
        
        int y=name.indexOf("i");
        System.out.println("index of i:"+y);
        
        int z=name.lastIndexOf("n");
        System.out.println("Last index of n:"+z);
        
        char ch=name.charAt(1);
        System.out.println("charecter in index 1:"+ch);
        
    }
    
}
