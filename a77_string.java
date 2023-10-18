/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author zzsha
 */
public class a77_string {

    public static void main(String[] args) {
        String firstname = "Aziz";
        String lastname = " Safin";

        String fullname = firstname + lastname;
        System.out.println("full name:" + fullname);

        String uppercase = fullname.toUpperCase();
        System.out.println("uppercase:" + uppercase);

        String lowercase = fullname.toLowerCase();
        System.out.println("lowercase:" + lowercase);

        boolean x = fullname.startsWith("A");
        System.out.println("Name starts with A:" + x);

        boolean y = fullname.endsWith("m");
        System.out.println("Name ends with A:" + y);

    }

}
