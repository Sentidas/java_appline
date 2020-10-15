package task7_8.operations;

public class Division extends Operation implements DoOperation{


  public Division(double x, double y) {
    super(x, y);
  }

  public double doOperation() {
    double res = super.x / super.y;
    return res;
  }
}
