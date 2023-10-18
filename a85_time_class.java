/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author zzsha
 */
public class a85_time_class {
    public static void main(String[] args) {
     LocalTime time=LocalTime.now();
        System.out.println(time);
        
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
         String x=time.format(formatter);
         System.out.println(x);
    }
    
}
