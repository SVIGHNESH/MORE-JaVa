import java.lang.Math;

//constant
class SinFunction {
  private static final double PI = 3.14159265358979323846;
  private static final double TWO_PI = 2.0 * PI;

  public static double factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    double result = 1;
    for (int i = 2; i <= n; i++) {
      result = result * i;
    }
    return result;
  }

  public static double power(double base, int exponent) {
    if (exponent == 1 || exponent == 0) {
      return 1;
    }
    double result = 1.0;
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }
    return result;
  }

  public static double sinValue(double x, int terms) {
    x = x % TWO_PI;

    double result = 0.0;
    for (int i = 0; i < terms; i++) {
      int exponent = 2 * i + 1;
      int sign = 0;
      if (i % 2 == 0) {
        sign = 1;
      } else {
        sign = -1;

      }

      result += sign * power(x, exponent) / factorial(exponent);

    }
    return result;

  }

  public static void main(String[] args) {
    double[] testValues = { 0, PI / 6, PI / 4, PI / 3, PI / 2, PI, 3 * PI / 2, TWO_PI, 5 };

    for (double angle : testValues) {
      double ourResult = sinValue(angle, 30);
      double mathResult = Math.sin(angle);
      double diff = Math.abs(ourResult - mathResult);
      System.out.printf("%-11.4f | %-10.8f | %-10.8f | %.10e\n",
          angle, ourResult, mathResult, diff);

    }
  }

}
