/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author zzsha
 */
public class binary_octal_hexadecimal_to_decimal {
    
    public static void main(String[] args) {
        
        
        String binary="1010";
        int x=Integer.parseInt(binary, 2);
        System.out.println(x);
        
        String octal="19";
        int y=Integer.parseInt(octal, 8);
        System.out.println(y);
        
        String hexadecimal="15";
        int z=Integer.parseInt(hexadecimal, 16);
        System.out.println(z);
    }
    
}
