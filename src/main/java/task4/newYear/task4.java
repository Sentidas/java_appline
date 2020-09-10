package task4.newYear;

import task4.newYear.myPackage.Candy;
import task4.newYear.myPackage.ChupaChups;
import task4.newYear.myPackage.Gift;
import task4.newYear.myPackage.Jellybean;

public class task4 {
  public static void main(String[] args) {
    Candy candy = new Candy("disney", 55.35, 1.34, "veryDulce");
    ChupaChups chupaChups = new ChupaChups("mikky", 105.45, 2.3, "medium");
    Jellybean jellybean = new Jellybean();
    jellybean.setMaker("sunnyDay");
    jellybean.setColor("red");
    jellybean.setPrice(99.99);
    jellybean.setWeight(3.67);

    Gift[] box = {candy, chupaChups, jellybean};

    System.out.println("Тебе подарили подарок с: ");
    for (Gift gift : box) {
      System.out.println(gift.toString());
    }

    double allPrice = 0;
    for (int i = 0; i < box.length; i++) {
      allPrice = allPrice + box[i].getPrice();
    }
    System.out.println("Oбщая стоимость твоего подарка: " + allPrice);

   double allWeight = 0;
    for (Gift gift: box) {
      allWeight = allWeight + gift.getWeight();
    }
    System.out.println("Oбщий вес твоего подарка: " + allWeight);
  }
}

