public class Exec1 {
  public static void main(String[] args) {

    int a, d;
    try {
      d = 0;
      a = 43 / d;

    } catch (ArithmeticException e) {
      System.out.println("Cannot divide the number with 0");

    }

  }

}
