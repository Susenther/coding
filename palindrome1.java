import java.util.*;
public class palindrome1 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String a = sc.nextLine();
        System.out.print(isPalindrome(a));


    }
    static int isPalindrome (String s){
        return s.equals(new StringBuilder(s).reverse().toString())? 1:0;
    }
    
}
