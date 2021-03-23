package 考前复习;

import java.util.Scanner;

public class Demo13 {
  public static void main(String[] args) {
    long number, old = 0, result = 0;
    System.out.println("清楚如你要相加多想次:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("请输入x的值：");
    number = sc.nextInt();
    int count = 0;
    while (count < n) {
      count++;
      old = old + number;
      result = result + old;
      number = number * 10;
    }
    System.out.println(result);
  }
}
