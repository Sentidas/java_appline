package task4.array;

public class Task4 {
  public static void main(String[] args) {

    int[] array = new int[20];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * 21) - 10;
    }

    System.out.println("[cтарый массив]");
    for (int number : array) {
      System.out.print(number + " ");
    }

    int minNumber = 10;
    int maxNumber = 0;
    int indexMaxNumber = 0;
    int indexMinNumber = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        if (maxNumber > array[i]) {
          maxNumber = array[i];
          indexMaxNumber = i;
        }
      } else if (array[i] > 0) {
        if (minNumber > array[i]) {
          minNumber = array[i];
          indexMinNumber = i;
        }
      }
    }
    System.out.println(" \nмаксимальное отрицательное число: " + maxNumber + ", число находится по индексу: " + indexMaxNumber);
    System.out.println("минимальное положительное число: " + minNumber + ", число находится по индексу: " + indexMinNumber);

    int numbers = array[indexMinNumber];
    array[indexMinNumber] = array[indexMaxNumber];
    array[indexMaxNumber] = numbers;

    System.out.println("[новый массив]");
    for (int number : array) {
      System.out.print(number + " ");
    }
  }
}
