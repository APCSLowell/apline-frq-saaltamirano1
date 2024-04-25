public class APLine
{
  private int a, b, c;
public APLine (int a1, int b1, int c1){
  a = a1;
  b = b1;
  c = c1;
}
public double getSlope (){
  return -(double)a/b;
}
public boolean isOnLine (int a2, int b2){
  if (a*a2 + b*b2 + c == 0){
    return true;
  }
  return false;
}
}
