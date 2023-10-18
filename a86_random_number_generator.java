/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.util.Random;

/**
 *
 * @author zzsha
 */
public class a86_random_number_generator {
    public static void main(String[] args) {
        
        Random rand=new Random();
        int x=rand.nextInt(91)+10;
        System.out.println(x);
    }
}
