package 考前复习;

public class Demo30 {
  int maxDigit(int n) {
    int c = 0, d;
    while (n > 0) {
      d = n % 10;
      System.out.println("n = " + n);
      System.out.println("d = " + d);
      if (d > c) {
        c = d;
      }
      n /= 10;
    }
    return c;
  }

  public static void main(String[] args) {
    Demo30 me = new Demo30();
    System.out.println(me.maxDigit(321583));
  }
}
