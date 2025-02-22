import java.util.*;
public class sumofdigits {
    static int sum(int n){
        if(n<10)
        return n;
        else
        return (n%10)+sum(n/10);
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = ip.nextInt();
        int res = sum(n);
        System.out.print("The sum is:" +res);
    }







    
}
