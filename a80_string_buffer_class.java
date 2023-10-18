/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/*methods of String buffer calss:
1.StringBuffer sb=new StringBuffer" hellow world";
2.  .append=to merge different kind of data type together;
3.  .reverse= to reverse a number;
4.  .delete=to delete a number from -to;
5.  .setLength=set the string in a given length;

*/
public class a80_string_buffer_class {
    public static void main(String[] args) {
        String s1="Abdur Rob aziz";
        StringBuffer sb=new StringBuffer(s1);
        
        sb.append(" CSE engineer");
        sb.append( 22);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        sb.delete(0, 7);
        System.out.println(sb);
        
        sb.setLength(11);
        System.out.println(sb);
        
    }
    
    
}
