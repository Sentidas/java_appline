package task4.newYear.myPackage;

public class Jellybean extends Gift {
  private String color;

  public Jellybean() {}

  public Jellybean (String maker, double price, double weight, String color) {
    super(maker, price, weight);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return " -- Jellybean {" + super.toString() + ", color = " + color + "}";
  }
}
