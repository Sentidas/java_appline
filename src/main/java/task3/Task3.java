package task3;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {

    System.out.println("введите номер задачи (1 - запуск калькулятора, 2 - работа с массивом)");
    Scanner scanner = new Scanner(System.in);
    int numberTask = scanner.nextInt();

    if (numberTask == 1) {
    Calculator.doAction();

    } else if (numberTask == 2) {
      Arrays.doAction();

    } else {
      System.out.println("данная задача еще не реализована");
    }
  }


}
