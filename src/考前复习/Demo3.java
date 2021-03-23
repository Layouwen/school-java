package 考前复习;


public class Demo3 {
  public static void main(String[] args) {
    Demo3 now = new Demo3();
    now.Test();
  }

  void Test() {
    int k = 3, sum = 0, x;
    for (int i = 1; i <= k; i++) {
      x = 1;
      for (int j = 1; j <= i; j++)
        x = x * j;
      sum += x;
    }
    System.out.println(sum);
  }
}
