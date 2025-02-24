import java.util.*;

public class reverse1 {

    static void reverse(int n) {

        if (n>0){

            System.out.print(n%10);
            reverse(n/10);
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        reverse(a);
    }

}
