public class main {
    public static void main(String [] args){
        String x = "virat";
        String y = "rohit";
        String Temp;
        
        Temp = x;
        x = y;
        y = Temp;

        System.out.println("x :"+x);
        System.out.println("y :"+y);
    }
}