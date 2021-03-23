package 考前复习;

public class Demo10 {
  public static void main(String[] args) {
    System.out.println(fibonacci());
  }

  static int fibonacci() {
    int f1 = 1, f2 = 1, f;
    // 1 2
    // 2 3
    // 3 5
    for (int i = 3; i <= 6; i++) {
      f = f2;
      f2 = f1 + f2;
      f1 = f;
    }
    return f2;
  }
}
