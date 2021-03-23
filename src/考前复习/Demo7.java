package 考前复习;

public class Demo7 {
  public static void main(String[] args) {
    int geWei, shiWei, baiWei, x = 234;
    boolean result;
    geWei = x % 10;
    shiWei = x / 10 % 10;
    baiWei = x / 100;
    result = x == (geWei * geWei + shiWei * shiWei + baiWei + baiWei);
  }
}
