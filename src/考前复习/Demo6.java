package 考前复习;

public class Demo6 {
  public static void main(String[] args) {
    UserGetMoney u1 = new UserGetMoney();
    UserGetMoney u2 = new UserGetMoney();
    u1.start();
    u2.start();
  }

  public static class MBankComlex {
    private static int sum = 2000;

    public synchronized static void take(int k) {
      int temp = sum;
      temp -= k;
      try {
        int sleepNumber = (int) (100 * Math.random());
        System.out.println(sleepNumber + "停留时间");
        Thread.sleep(sleepNumber);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      sum = temp;
      System.out.println(Thread.currentThread() + "sum = " + sum);
    }
  }

  public static class UserGetMoney extends Thread {
    public void run() {
      for (int i = 1; i < 4; i++) {
        MBankComlex.take(100);
      }
    }
  }
}
