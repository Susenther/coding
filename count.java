public class count {
    public static void main(String [] args){
        String s1 = "java is an object programming";
        //int count = o;
        int count = s1.length();
        for(int i = 0;i< s1.length();i++){
            if(s1.charAt(i) == ' '){
               //count++;
               count--;
            }       
         }
         System.out.println(count);

    }
    
}
