package task7;


import task7.operations.*;
import java.io.IOException;

public class Test {
  public static void main(String[] args) throws IOException {
    EntryData entryData = new EntryData();
    entryData.entryNumbers();
    entryData.entryOpetation();

    System.out.println("____________________________________________");
    System.out.println("Введенные данные: ");
    System.out.println(entryData.getNumber1());
    System.out.println(entryData.getSymbol());
    System.out.println(entryData.getNumber2());

    Test test = new Test();
    double result = test.getOperation(entryData);

    Report report = new Report();
    report.writeOperation(entryData, result);


  }
 double res = 0;
  public double getOperation(EntryData entryData) {

    switch (entryData.getSymbol()) {
      case '+':
        Addition addition = new Addition(entryData.getNumber1(), entryData.getNumber2());;
        res = addition.rounding(addition.doOperation()); // вычисление суммы
        break;
      case '-':
        Division division = new Division(entryData.getNumber1(), entryData.getNumber2());
        res = division.rounding(division.doOperation());  // вычисление разности
        break;
      case '*':
        Multiplication multiplication = new Multiplication(entryData.getNumber1(), entryData.getNumber2());
        res = multiplication.rounding(multiplication.doOperation()); // вычисление произведения
        break;
      case '/':
        Subtraction substraction = new Subtraction(entryData.getNumber1(), entryData.getNumber2());
        res = substraction.doOperation(); // вычисление частного
        try {
          if (res== Double.POSITIVE_INFINITY || res == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException();
        } else {
        res = substraction.rounding(substraction.doOperation());
      }
        } catch (ArithmeticException e) {
          System.out.println("Делить на ноль нельзя!");
        }
        break;
      default:
        System.out.println("неизвестная операция либо деление на ноль, введите снова");
    }
    return res;
  }
}