class ThrowingException {
  public static void main(String[] args) {
    check(4);
  }

  public static void check(int age) {
    if (age < 18) {
      throw new IllegalArgumentException("NOt Eligible for the Voting");

    } else {
      System.out.println("Elgible for the Vote!!!");
    }
  }
}
