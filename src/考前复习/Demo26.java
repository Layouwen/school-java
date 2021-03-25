package 考前复习;

public class Demo26 {
  public static void main(String[] args) {
    String s = "ABCDEFG";
    System.out.println(s.substring(3)); // DEFG
    System.out.println(s.substring(3, 5)); // DE

    int a = 1, b = 5, result;
    if (a - b < 5) result = b - a;
    else result = a - b;
    System.out.println(result);
  }
}
