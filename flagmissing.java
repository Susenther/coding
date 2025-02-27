import java.util.*;
    public class flagmissing {
        public static void main(String [] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();}
        findmissing(arr,n);
    
        }
    
    static void findmissing(int a[],int n)
    {
        int exp =a[0];
        int flag =0;
        for(int i=0;i<n;i++)
        {
            if(a[i] != exp)
            {
              while(exp<a[i]-i){
                System.out.println(exp + i);
                exp++;
              }
            }
            
        }
        if (flag==0){
          System.out.println("missing");
        }
        
      
         
    }
    
  }   
    
    
      
