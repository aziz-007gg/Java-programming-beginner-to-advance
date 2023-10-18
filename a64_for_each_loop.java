/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author zzsha
 */
public class a64_for_each_loop {
    public static void main(String[] args) {
        
        int[] number={1,4,7,2,3};
        int len=number.length;
        System.out.println(len);
        System.out.print("Numbers are:");
        for(int x:number)
        {
            System.out.print(" "+x);
        }
        System.out.println("");
        
       String[] name={"rony","jony","rasel","masud","kasem"};
        System.out.print("Names are:");
       for(String y:name)
       {
           System.out.print(y+",");
       }
    }
}
