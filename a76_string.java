/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author zzsha
 */

/*methods of Strings:
        1.String variable="value";
        2. .length=find the length of the String;
        3. .equals=to check whether two string is equal or not;
        4. .contains=to check whether a String contains the value of other Strings;
        5. .equalsIgnorecase=ignore the uppercase and lower case letter and check whether the two string is eqaul or not;
        6. .isEmpty=to check a string is empty or not;
        7. .concat=merge two string together;
        8. .toUppercase=All the letters will be uppercase in string;
        9. .tolowercase=All the letters will be lowercase in string;
        10. .EndsWith=check whether a string end with a letter or string;
        11. .startsWith=check whether a string starts with a letter or string;
        12. .CharAt=to find the letter by index;
        13. .codepointAt=print the asci value of a given index;
        14. .indexof=show the indax of a string;
        15. .lastIndextOf=show the last index of a letter that use multiple times in the string;
        16. .replace=replcae of charecter to antother charecter;
        17. .split=split the string accordin to a given unit;


 */
public class a76_string {

    public static void main(String[] args) {
        String name = "Abdur Rob Aziz";

        String n2 = new String("abdur Rob Aziz");

        System.out.println(name);
        System.out.println(n2);

        int length = name.length();
        System.out.println(length);

        boolean x = name.equals(n2);
        System.out.println(x);

        boolean y = name.contains(n2);
        System.out.println(y);

        boolean z = name.isEmpty();
        System.out.println(z);
    }

}
