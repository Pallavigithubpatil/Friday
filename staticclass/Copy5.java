class sample5{
  static float area(int r){
  float d=3.14f;
  float c= d*r*r;
  return c;
  }
  }
  class Copy5{
  public static void main(String args[]){
  float x=sample5.area(5);
  System.out.println(x);
  }
  }
  