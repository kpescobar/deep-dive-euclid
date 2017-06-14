
public class Gcd {

  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.printf("a= %d, b= %d%n", a, b);
    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      System.out.println("This application requires two integer arguments on the command line.");
    }
      catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("This application requires two integer arguments on the command line.");
      }
  }



}
