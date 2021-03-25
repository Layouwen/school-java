package 考前复习;

public class Demo28 {
  int lessKeyFirst(int[] a, int key) {
    int index = -1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < key) index = i;
    }
    return index;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, -1};
    Demo28 me = new Demo28();
    System.out.println(arr.length - 1);
    System.out.println(me.lessKeyFirst(arr, 0));
  }
}
