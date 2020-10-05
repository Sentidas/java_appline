package task7.operations;

public class Operation {

  protected double x;
  protected double y;

  public Operation(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double rounding (double res) {
    System.out.printf("Результат операции:\n%.4f", res);
    return res;
  }
}
