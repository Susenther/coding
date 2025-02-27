import java.util.*;
public class missingelement {
    public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();}
      int res =findmissing(arr,n);
      System.out.println("The missing element is: " + res );

    }



    
    


static int findmissing(int[]arr,int n)
{
    for(int i=0;i<n;i++){
        if(arr[i]!= i+1){
            return i+1;
        }
        
    }
    return -1;
  }
}



