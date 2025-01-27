public class fibo {
    public static void main(String [] args){
        int n = 5;
        int a = 0;
        int b = 1;
        int next = a; 
        System.out.println(a);
        for(int i = 0;i <= n;i++){
            next = a + b;
            a = b;
            b = next;
            System.out.println(next);

        }
    }
    
}
