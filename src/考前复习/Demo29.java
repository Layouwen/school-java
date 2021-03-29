package 考前复习;

public class Demo29 {
  int getNum(int n) {
    int x = 0;
    do {
      n /= 10;
      x++;
    } while (n != 0);
    return x;
  }

  public static void main(String[] args) {
    Demo29 me = new Demo29();
    System.out.println(me.getNum(22));
  }
}
