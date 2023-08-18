class sample1{
  static int  add(int a, int b){
  int c= a+b;
   return c;
  }
  }
  class Copy1{
  public static void main(String args[]){
   
   sample1 s1=new sample1();
   int p=s1.add(10,20);
   System.out.println(p);
   
  }
  }
  