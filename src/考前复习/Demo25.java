package 考前复习;

public class Demo25 {
  public static void main(String[] args) {
    Demo25 me = new Demo25();
    System.out.println(me.sumS(14));
  }

  double sumS(int n) {
    double S, fz, fm, temp;
    int flag;
    S = 0.0;
    fz = 2.0;
    fm = 1.0;
    flag = 1;
    for (int i = 1; i <= n; i++) {
      // 计算此次结果
      S = S + flag * fz / fm;
      // 将原分母保存
      temp = fm;
      // 将原分子改为新分母
      fm = fz;
      // 原分母 + 原分子 = 新的分子
      fz += temp;
      // 正数 / 负数
      flag = -flag;
    }
    return S;
  }
}
