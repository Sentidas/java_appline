package task4.newYear.myPackage;

public class Candy extends Gift {

  private String dulce;

  public Candy(String maker, double price, double weight, String dulce) {
    super(maker, price, weight);
    this.dulce = dulce;
  }
  public String getDulce() {
    return dulce;
  }

  public void setDulce(String dulce) {
    this.dulce = dulce;
  }

  @Override
  public String toString() {
    return " -- Candy {" + super.toString() + ", dulce = " + dulce + "}";
  }
}
