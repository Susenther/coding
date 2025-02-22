import java.util.*;
public class sum {
    static int sum(int n){
        if(n==1)
        return 1;
        if(n==0)
        return 0;
        else
        return n + sum(n-1); 
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = ip.nextInt();
        int res = sum(n);
        System.out.println("The sum is:" +res);

    }
}
    

