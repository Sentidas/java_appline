package task4.newYear.myPackage;

public class ChupaChups extends Gift {
  private String size;

  public ChupaChups (String maker, double price, double weight, String size) {
    super(maker, price, weight);
    this.size = size;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return " -- ChupaChups {" + super.toString() + ", size = " + size + "}";
  }
}
