import java.util.*;
public class power {
    
        static int power(int a,int n ){
            if(n==0){
            return 1;
             } else if (n==1){
                return a;
            } else{
                return a* power(a,n-1);
            }

        }

        public static void main(String [] args){
            Scanner ip = new Scanner(System.in);
            System.out.print("Enter the number:");
            int a = ip.nextInt();
            int n = ip.nextInt();
            int res = power(a,n);
            System.out.print("The power is:"+res);




                  
            
        
    }
    
}
