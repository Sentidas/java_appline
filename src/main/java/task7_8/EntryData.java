package task7_8;

import java.util.Scanner;

public class EntryData {

  private double number1;
  private double number2;
  private char symbol;

  public EntryData(double number1, double number2, char symbol) {
    this.number1 = number1;
    this.number2 = number2;
    this.symbol = symbol;
  }
  public EntryData() {
    this.number1 = number1;
    this.number2 = number2;
    this.symbol = symbol;
  }

  Scanner scanner = new Scanner(System.in);

    public void entryNumbers () {
    System.out.println("введите первое число");
    number1 = scanner.nextDouble();

    System.out.println("введите второе число");
    number2 = scanner.nextDouble();
  }

    public void entryOpetation () {
    System.out.println("введите знак операции, допускается ввод операций: сложение '+'," +
            " вычитание '-', умножение '*', деление '/'");
    symbol = scanner.next().charAt(0);
    scanner.close();
  }

    public double getNumber1 () {
    return number1;
  }
    public double getNumber2 () {
    return number2;
  }
    public char getSymbol () {
    return symbol;
  }

  public void setNumber1(double number1) {
    this.number1 = number1;
  }

  public void setNumber2(double number2) {
    this.number2 = number2;
  }

  public void setSymbol(char symbol) {
    this.symbol = symbol;
  }
}

