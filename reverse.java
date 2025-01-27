class reverseString {
    public static void main(String [] args){
      String in = "mum";
      String r = "";
      for (int i = in.length()-1;i>=0;i--) {
        r += in.charAt(i);
      }
      System.out.println(r);
    }
}

