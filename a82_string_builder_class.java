/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author zzsha
 */
public class a82_string_builder_class {
    
    public static void main(String[] args) {
        
        StringBuilder name=new StringBuilder("Abdur");
        System.out.println(name);
        
        name.append(" Rob");
        name.append( " aziz");
        System.out.println(name);
        
        name.delete(3, 7);
        System.out.println(name);
        
        name.reverse();
        System.out.println(name);
        
        name.setLength(7);
        System.out.println(name);
    }
    
}
