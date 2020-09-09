package task3;

import java.util.Scanner;

public class Arrays {

  public static void doAction() {
    System.out.println("введите размер массива");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] arrayWord = new String[n];
    Scanner scanner1 = new Scanner(System.in);
    for (int i = 0; i < arrayWord.length; i++) {

      System.out.println("введите " + (i + 1) + "-e слово");
      arrayWord[i] = scanner1.nextLine();
    }

    for (String s : arrayWord) {
      System.out.println(s);
    }
    int maxWord = 0;
    int index = 0;
    String word = null;

    for (int i = 0; i < arrayWord.length; i++) {
      if (maxWord < arrayWord[i].length()) {
        maxWord = arrayWord[i].length();
        index = i;
        word = arrayWord[i];
      }
    }
    System.out.println("максимальное слово '" + word + "', с индексом " + index + " и размерностью: " + maxWord);
    System.out.println("В случае, если в массиве несколько слов максимальной длины, будет выведено первое слово с максимальной длиной.");

      scanner.close();
      scanner1.close();
    }
  }



