class sample4{
  static int div(int a, int b){
  int c= a/b;
   return c;
  }
  }
  class Copy4{
  public static void main(String args[]){
   sample4 s4=new sample4();
   int p=s4.div(100,20);
   System.out.println(p);
   
  }
  }