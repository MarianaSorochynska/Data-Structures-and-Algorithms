import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("Unsorted Array ---------------------------------------------------");
    ArrayList<Integer> integerList = Lab4.getList();
    Lab4.outputList(integerList);

    System.out.println("\n\nBubble sort results ----------------------------------------------");
    long startBubble = System.nanoTime();
    ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
    long endBubble = System.nanoTime();
    Lab4.outputList(bubbleSortedList);
    System.out.println("\nBubble sort time: " + (endBubble - startBubble) + " ns");

    System.out.println("\n\nInsertion sort results -------------------------------------------");
    long startInsertion = System.nanoTime();
    ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
    long endInsertion = System.nanoTime();
    Lab4.outputList(insertionSortedList);
    System.out.println("\nInsertion sort time: " + (endInsertion - startInsertion) + " ns");

  }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    for (int i = 1; i < integerList.size(); i++) {
      int key = integerList.get(i);
      int j = i - 1;

      while (j >= 0 && integerList.get(j) > key) {
        integerList.set(j + 1, integerList.get(j));
        j--;
      }
      integerList.set(j + 1, key);
    }

    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    for (int k = 1; k < integerList.size(); k++) {
      boolean needNextPass = false;
      for (int i = 0; i < integerList.size() - k; i++) {
        if (integerList.get(i) > integerList.get(i + 1)) {
          int temp = integerList.get(i);
          integerList.set(i, integerList.get(i + 1));
          integerList.set(i + 1, temp);
          needNextPass = true;
        }
      }
    }

    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
      while ((line = br.readLine()) != null) {
        integerList.add(Integer.parseInt(line));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
      System.out.print(integerList.get(i) + " ");
    }
  }
}