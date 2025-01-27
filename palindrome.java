public class palindrome {
    public static void main(String [] args){
        String in = "ungoppan";
        String r = "";
        for(int i = in.length()-1;i>=0;i-- ){
            r += in.charAt(i);
        }
        System.out.println(r);
        if(r.equals(in)){
            System.out.println("palindrome");
       }else{
        System.out.println("not a palindrome");
       }
    }
    
}
