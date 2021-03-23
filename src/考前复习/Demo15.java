package 考前复习;

public class Demo15 {
  public static void main(String[] args) {
    int a = 2, b = 2, c = 2;
    a = b + c++ - a; // 2
    b = a * c++; // 6
    c = b - ++a; // 3
    System.out.println(a+b);
  }
}
