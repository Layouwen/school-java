package 线程;

class LeftHand extends Thread {
  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println("我是左手!");
      try {
        sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class RightHand extends Thread {
  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println("我是右手!");
      try {
        sleep(300);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class Demo1 {
  public static void main(String[] args) {
    LeftHand left = new LeftHand();
    RightHand right = new RightHand();
    left.start();
    right.start();
  }
}
