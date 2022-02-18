import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void firstSortingAlgorithm(int[] elements)
  {
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {      
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
  }

  // Part A.  Which Sort is Which?
  public static void secondSortingAlgorithm(int[] elements)
  { 
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {     
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
      }
      elements[possibleIndex] = temp;
    }
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int count = 0;

    for (int i = 0; i < words.size(); i++) {
      int min = i;
      for (int j = i+1; j < words.size(); j++) {
        count++;
        if(words.get(i).compareTo(words.get(min)) < 0) {
          min = j;
        }
      }
      String str = words.get(i);
      words.set(i, words.get(min));
      words.set(min, str);
    }

    System.out.println("Selection sort, num of iterations: " + count);
  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {    
    int count = 0;

    for (int i = 0; i < words.size(); i++) {
      String str = words.get(i);
      int possible = i;
      while (possible > 0 && str.compareTo(words.get(possible - 1)) < 0) {
        words.set(possible, words.get(possible - 1));
        possible--;
        count++;
      }
      words.set(possible, str);
    }

    System.out.println("Iteration sort, num of iterations: " + count);
  }
}