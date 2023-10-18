/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author zzsha
 */
public class a84_date_class {
    public static void main(String[] args) {
         Date date=new Date();
         DateFormat dateformat=new SimpleDateFormat("dd/MM/YYYY");
         String currentdate=dateformat.format(date);
         System.out.println(currentdate);
         
    }
    
}
