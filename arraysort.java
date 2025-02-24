import java.util.*;
public class arraysort {

    public static boolean isSorted(int []a,int n ){
        for(int i=0;i<n-1,i++){
            if(a[i]<a[i+1])
            return false;
            
        }
        return true;

    }

    public static void main(String []  args){

    Scanner ip = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n =ip.nextInt();
    int []arr = new int[n];
    System.out.println("Enter the Elements: ");
    for(int i=0;i<n;i++)
       arr[i] = ip.nextInt();

       if(isSorted(arr,n))
              System.out.print("yes! Sorted");

        else
           System.out.print("no! Not Sorted");      
    


    }

    
}
