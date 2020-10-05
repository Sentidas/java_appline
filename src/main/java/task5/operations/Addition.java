package task5.operations;

public class Addition extends Operation implements DoOperation {

  public Addition(double x, double y) {
    super(x, y);
  }

  public double doOperation() {
    double res = super.x + super.y;
    return res;
  }
}

