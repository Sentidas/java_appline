package task5.operations;

public class Multiplication extends Operation implements DoOperation {

  public Multiplication(double x, double y) {
    super(x, y);
  }

  public double doOperation() {
    double res = super.x * super.y;
    return res;
  }
}
