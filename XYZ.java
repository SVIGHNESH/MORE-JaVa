
class add {
  int x, y;

  add(int x, int y) {

    this.x = x;
    this.y = y;

  }

  void getsum() {
    System.out.println(x + y);

  }
}

class XYZ {

  public static void main(String args[]) {

    add ob = new add(10, 20);
    ob.getsum();
  }
}
