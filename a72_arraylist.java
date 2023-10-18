/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.util.ArrayList;

/**
 *
 * @author zzsha
 */
public class a72_arraylist {

    public static void main(String[] args) {

        /*methods of arraylists:
        1 .add=to add elements;
        2 .remove=to remove index;
        3 .clear=to remove elements;
        4 .is empty=to check arraylist empty or not;
        5 .contains=to check arraylist contains a certain elements or not;
        6 .index of=to get the index of an elements;
        7 .set=to replace arraylist elements and index;
        8 .get=to get value of elements from index;
        9 .add all=to add all the elements of an arraylist to a new arraylist;
        10 .equals=to check an arraylist is equal to another arraylist or not;
        11 .size=to check the size of an arraylist;
         */
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 50);
        System.out.print("Elements:");
        for (int x : number) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("Array size:" + number.size());

        number.remove(3);
        System.out.println("after removing index 3:" + number);

        number.removeAll(number);
        System.out.println("After removing all elements:" + number);
    }
}
