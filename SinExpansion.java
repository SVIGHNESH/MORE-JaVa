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

  public static double degToRad(double x){
    return x * PI / 180;
  }

  public static double getDifference(double a, double b) {
    return Math.max(a, b) - Math.min(a, b);
}

  public static void main(String[] args) {
      // double[] testValues = {0, PI / 6, PI / 4, PI / 3, PI / 2, PI, 3 * PI / 2, TWO_PI};
      // System.out.println("Taylor Series Sine Calculator (30 terms)");
      // System.out.println("=======================================");
      // System.out.println("Angle (rad) | Our Sin    | Math.sin   | Difference");
      // System.out.println("-----------------------------------------------");

      // for (double angle : testValues) {
      //     double ourResult = sinTaylor(angle, 30);
      //     double mathResult = Math.sin(angle);
      //     double diff = Math.abs(ourResult - mathResult);
      //     System.out.printf("%-11.4f | %-10.8f | %-10.8f | %.10e\n", angle, ourResult, mathResult, diff);
      // }

      
      double ourResult = sinTaylor(degToRad(90), 30);
      double mathResult = Math.sin(degToRad(90));
      System.out.println(ourResult);
      System.out.println(mathResult);
      System.out.println("Difference between The Math.Sin() and our defined Sin() is  " + getDifference(ourResult,mathResult) );
  }
}