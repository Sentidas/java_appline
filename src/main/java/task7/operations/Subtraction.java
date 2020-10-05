package task7.operations;



public class Subtraction extends Operation implements DoOperation{

  public Subtraction(double x, double y) {
    super(x, y);
  }

  public double doOperation() {
    double res = super.x / super.y;
    return res;
  }
}
