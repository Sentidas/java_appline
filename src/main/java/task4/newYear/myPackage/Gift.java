package task4.newYear.myPackage;

abstract public class Gift {
  private String maker;
  private double price;
  private double weight;

  public Gift() {}

  public Gift(String maker, double price, double weight) {
    this.maker = maker;
    this.price = price;
    this.weight = weight;
  }

  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "maker = " + maker + ", price = " + price + ", weight = " + weight;
  }
}
