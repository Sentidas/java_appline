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
    char symbol = scanner.next().charAt(0);

    switch (symbol) {
      case '+':
        System.out.printf("Cумма чисел: %.4f", number1 + number2); // вычисление суммы
        break;
      case '-':
        System.out.printf("Разность чисел: %.4f", number1 - number2); // вычисление разности
        break;
      case '/':
        System.out.printf("Частное чисел: %.4f", number1 / number2); // вычисление частного
        break;
      case '*':
        System.out.printf("Произведение чисел: %.4f", number1 * number2); // вычисление произведения
        break;
      default:
        System.out.println("неизвестная операция, введите снова");

        scanner.close();
    }
  }
}
