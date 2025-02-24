import java.util.*;
public class sum1 {
    static int  sum(int n){
        if(n>0){
            return n + sum(n-1);}
        else{
            return 0;
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sum(n);

    }
}
