// Java program to reverse a string using StringBuffer class

import java.io.*;
import java.util.*;

class GFG {
    static String stringReverse(String s) {
        StringBuilder res = new StringBuilder(s);
        res.reverse();
          return res.toString();
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(stringReverse(s));
    }
    
}

