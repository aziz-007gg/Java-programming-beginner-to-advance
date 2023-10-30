/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author zzsha
 */
public class Decimal_to_binary_octal_hexadeciaml {
    public static void main(String[] args) {
        
        
        int x=9;
        String binary=Integer.toBinaryString(x);
        System.out.println(binary);
        
        String octal=Integer.toOctalString(x);
        System.out.println(octal);
        
        String hexadecimal=Integer.toHexString(x);
        System.out.println(hexadecimal);
        
    }
    
}
