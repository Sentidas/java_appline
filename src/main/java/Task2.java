/**
 * Created by Bakhareva.Elena on 09.09.2020
 * @author Bakhareva.Elena
 * @see #operation()
 */

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {

    System.out.println("введите первое число");
    Scanner scanner = new Scanner(System.in);
    double number1 = scanner.nextDouble();

    System.out.println("введите второе число");
    double number2 = scanner.nextDouble();

    System.out.println("введите знак операции, допускается ввод операций: сложение '+', вычитание '-'," +
            "умножение '*', деление '/'");
    Scanner scanner1 = new Scanner(System.in);
    String symbol = scanner1.nextLine();

    operation(number1, number2, symbol);
    scanner.close();
    scanner1.close();
  }
  /**
   *
   * @param number1 input number1
   * @param number2 input number2
   * @param symbol input  math operation symbol
   */

  public static void operation(double number1, double number2, String symbol) {
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
      }
  }

