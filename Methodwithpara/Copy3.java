class sample3{
  static int mul(int a, int b){
  int c= a*b;
   return c;
  }
  }
  class Copy3{
  public static void main(String args[]){
   sample3 s3=new sample3();
   int p=s3.mul(25,5);
   System.out.println(p);
   
  }
  }
  