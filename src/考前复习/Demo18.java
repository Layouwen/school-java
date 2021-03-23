package 考前复习;

class MyThread extends Thread {
  public void run() {
    for (int i = 0; i < 3; i++) {
      try {
        sleep(10000);
        System.out.println("我刚刚休息了");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("休息结束");
  }
}

public class Demo18 {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    mt.start();
  }
}
