import java.util.*;
public class factorial {
    static int factorial(int n ){                 // with RT with  Arg 
     if(n==1 || n==0)
     return 1;
     else
       return n*factorial(n-1);
}
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= ip.nextInt();                         //4
        int res = factorial(n);                                //method call or invoke
        System.out.println("Factorial =" +res);
    }
    
}
