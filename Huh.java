public class Huh {
  public static void main(String[] args) {
  int x, y;
  
  x = 10;
  y = 20;

  if(x < y) System.out.println(" x is less than y ");
  x = x * 2;
  if (x == y) System.out.println(" x now equal to y ");
  x = x * 2;
  if (x > y ) System.out.println(" x greater than y ");
  if ( x == y) System.out.println(" You wont see this ");
  
  int num;
  num = 20;

  System.out.print("This is num: " + num);
  num = num * 2;
  System.out.print(" The value of num * 2 is: ");
  System.out.println(num);

  int p;
  for(p = 0; p<10; p = p + 1);
  System.out.println(" This is p: " + p);

  int m,t;
  t = 22;

  for(m = 0; m<10; m++) {
  System.out.println(" This is m: " + m);
  System.out.println("This is t: " + t);
  t = t - 2;

  
}
}
}