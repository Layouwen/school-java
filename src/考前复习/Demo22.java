package 考前复习;

class Station extends Thread {
  public Station(String name) {
    super(name);
  }

  static int tick = 10;

  static Object ob = "aa";

  @Override
  public void run() {
    while (tick > 0) {
      synchronized (ob) {
        if (tick > 0) {
          System.out.println(getName() + "卖出了第" + tick + "张票");
          tick--;
        } else {
          System.out.println(getName() + "票卖完了");
        }
      }
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class Demo22 {
  public static void main(String[] args) {
    Station s1 = new Station("一");
    Station s2 = new Station("二");
    Station s3 = new Station("三");
    s1.start();
    s2.start();
    s3.start();
  }
}
