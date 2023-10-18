/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author zzsha
 */
public class a79_string {
    public static void main(String[] args) {
        
        String s1=" I am abdur Rob aziz";
        System.out.println(s1);
        String s2=s1.replace('a','e');
        System.out.println(s2);
        
        String [] name=s1.split(" ");
        
        for(String x:name){
            System.out.println(x);
        }
    }
    
}
