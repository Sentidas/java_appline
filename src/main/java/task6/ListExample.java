package task6;

import java.io.*;
import java.util.*;

public class ListExample {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(new FileReader(new File("task6.txt")))) {

    List<String> list = new ArrayList<>();
    Map<String, Integer> map = new TreeMap<>();
    Set<String> set = new TreeSet<>();

    // разделитель на слова  - пробельные символы. Регулярка "\\W" для ввода нормального сложного текста почему-то не работает
    scanner.useDelimiter("\\s+");


    // запись всех слов из файла в ArrayList
    Integer count = 1;
    while (scanner.hasNext()) {
      String word = scanner.next().toLowerCase();
      list.add(word);
    }
    System.out.println("Все слова из файла:");

    // вывод записанных слов из файла в ArrayList
    for (String word : list) {
      System.out.print(word + " ");
    }

    // поиск максимального слова и количества (макс количество раз в тексте) и сортировка по алфавиту всех слов из файла
    String maxWord = null;
    int maxCount = 1;
    for (int i = 0; i < list.size(); i++) {
      map.put(list.get(i), Collections.frequency(list, list.get(i)));
      if (maxCount < Collections.frequency(list, list.get(i))) {
        maxCount = Collections.frequency(list, list.get(i));
        maxWord = list.get(i);
      }
    }

    // cоздание списка слов, если в тексте максимальное количество раз встречаются несколько слов, сортировка их по алфавиту
    for (String words : list) {
      if (maxCount == Collections.frequency(list, words)) {
        set.add(words);
      }
    }
    System.out.println("\n___________________________________________");
    System.out.println("Cлова из файла отсортированы по алфавиту [слово=количество раз в тексте]: \n" + map );
    System.out.println("\n___________________________________________");
    System.out.println("\nПервое самое больше слово '" + maxWord + "' встречается в тексте " + maxCount +  " раз");
    System.out.println("\n___________________________________________");
    System.out.println("Данные слова встречаются в тексте по " + maxCount + " раз и отсортированы по алфавиту: \n" + set);

  } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}



