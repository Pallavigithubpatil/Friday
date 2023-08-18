class sample5{
  static float area(int r){
  float d=3.14f;
  float c= d*r*r;
  return c;
  }
  }
  class Copy5{
  public static void main(String args[]){
  sample5 s5=new sample5();
  float x=s5.area(5);
  System.out.println(x);
  }
  }