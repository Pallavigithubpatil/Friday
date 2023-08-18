class sample2{
  static int  sub(int a, int b){
  int c= a+b;
   return c;
  }
  }
  class Copy2{
  public static void main(String args[]){
  int a=sample2.sub(100,20);
  System.out.println(a);
  }
  }
  