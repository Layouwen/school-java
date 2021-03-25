package 考前复习;

public class Demo19 {
  public static void main(String[] args) {
    int firstArray[] = {12, 2, 33, 54};
    int secondArray[] = new int[5];
    System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);
    System.out.println("secondArray:");
    for (int i = 0; i < secondArray.length; i++) {
      System.out.print(secondArray[i] + ",");
    }
  }
}
