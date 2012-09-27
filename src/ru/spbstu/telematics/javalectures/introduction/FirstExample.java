package ru.spbstu.telematics.javalectures.introduction;
public class FirstExample {
  public static void main(String[] args) {

    int var = 1;
    Object o = new Object();
    o = null;

    if (o == null) {
      System.out.println("o is null");
    }

    double[] arr = new double[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Math.sqrt(i);
    }

    while (true) {
      // do something
    }

//http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
  }
}
