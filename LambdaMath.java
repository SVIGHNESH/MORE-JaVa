interface MathOperation {
  public int operate(int a, int b);

}

class LambdaMath {
  public static void main(String[] args) {
    MathOperation mo = (a, b) -> a + b;
    MathOperation m1 = (a, b) -> a - b;
    MathOperation m2 = (a, b) -> a * b;
    MathOperation m3 = (a, b) -> a / b;

    System.out.println(mo.operate(3, 3));
    System.out.println(m1.operate(3, 3));
    System.out.println(m2.operate(3, 3));
    System.out.println(m3.operate(3, 3));
  }
}
