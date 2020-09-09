package task3;

import java.util.Scanner;

public class Calculator {

  public static void doAction() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("введите первое число");
    double number1 = scanner.nextDouble();
    System.out.println("введите второе число");
    double number2 = scanner.nextDouble();

    System.out.println("введите знак операции, допускается ввод операций: сложение '+'," +
            " вычитание '-', умножение '*', деление '/'");
    Scanner scanner1 = new Scanner(System.in);
    String symbol = scanner1.nextLine();

    if (symbol.equals("+")) {
      System.out.printf("Cумма чисел: %.4f", number1 + number2); // вычисление суммы
    } else if (symbol.equals( "-")) {
      System.out.printf("Разность чисел: %.4f", number1 - number2); // вычисление разности
    } else if (symbol.equals( "/")) {
      System.out.printf("Частное чисел: %.4f", number1 / number2); // вычисление частного
    } else if (symbol.equals( "*")) {
      System.out.printf("Произведение чисел: %.4f", number1 * number2); // вычисление произведения
    } else
      System.out.println("неизвестная операция, введите снова");

    scanner.close();
    scanner1.close();
  }

}
