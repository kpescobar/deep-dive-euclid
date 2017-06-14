
public class Gcd {

  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = gcd(a, b);
      
      System.out.printf("The GCD of (%d, %d) = %d%n", a, b, c);
      
    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      System.out.println("This application requires two integer arguments on the command line.");
    }
      catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("This application requires two integer arguments on the command line.");
      }
  }
  
  public static int gcd(int a, int b) {
    a= Math.abs(a);
    b= Math.abs(b);  
    if (a == 0) {
      return b;
    }
    if (b == 0) {
      return a;
    }
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {  
        b = b - a;
      }  
    }
    return a;
  }


}
