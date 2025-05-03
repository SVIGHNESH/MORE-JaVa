public class SinExpansion {
  // Constants
  private static final double PI = 3.14159265358979323846;
  private static final double TWO_PI = 2.0 * PI;

  public static double power(double x, int n) {
    if (n == 0) {
      return 1.0;
    }

    double result = 1.0;
    for (int i = 0; i < n; i++) {
      result *= x;
    }
    return result;
  }

  public static long factorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Factorial is not defined for negative numbers");
    }

    if (n == 0 || n == 1) {
      return 1;
    }

    long result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static double sinTaylor(double x, int terms) {
    x = x % TWO_PI;

    double result = 0.0;
    for (int n = 0; n < terms; n++) {
      int exponent = 2 * n + 1;
      int sign = (n % 2 == 0) ? 1 : -1; // Simplified sign calculation
      result += sign * power(x, exponent) / factorial(exponent);
    }

    return result;
  }

  public static double degToRad(double x) {
    return x * PI / 180;
  }

  public static double getDifference(double a, double b) {
    return Math.max(a, b) - Math.min(a, b);
  }

  public static void main(String[] args) {
    double ourResult = sinTaylor(degToRad(90), 30);
    double mathResult = Math.sin(degToRad(90));
    System.out.println("The result of the user defined Sin() is " + ourResult);
    System.out.println("The Result of the MAth Defined SIN() is  " + mathResult);
    System.out
        .println("Difference between The Math.Sin() and our defined Sin() is  " + getDifference(ourResult, mathResult));
  }
}
