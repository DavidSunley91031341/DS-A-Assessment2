/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author 91031341
 *
 * Quick sort is a divide and conquer algorithm that chooses a pivot point in an
 * array and then partitions the array around that value, forming sub-lists.
 * This process repeats for all sub-lists. Sub-lists are then merged to form the
 * final sorted output.
 */
public class QuickSort {

  private CatalogueItem[] items;
  private int number;

  // Assigning values
  public void sortAsc(CatalogueItem[] values) {
    // check for empty or null array
    if (values == null || values.length == 0) {
      return;
    }
    this.items = values;
    number = values.length;
    quickSortAscend(0, number - 1);
  }

  // Assigning values
  public void sortDesc(CatalogueItem[] values) {
    // check for empty or null array
    if (values == null || values.length == 0) {
      return;
    }
    this.items = values;
    number = values.length;
    quickSortDescend(0, number - 1);
  }

  // Quick sort method for ascending order
  private void quickSortAscend(int low, int high) {

    int i = low, j = high;
    // Get the pivot element from the middle of the list
    int pivot = items[low + (high - low) / 2].getItemId();

    // Divide into two lists
    while (i <= j) {
      // If the current value from the left list is smaller than the pivot
      // element then get the next element from the left list
      while (items[i].getItemId() < pivot) {
        i++;
      }
      // If the current value from the right list is larger than the pivot
      // element then get the next element from the right list
      while (items[j].getItemId() > pivot) {
        j--;
      }

      // If we have found a value in the left list which is larger than
      // the pivot element and if we have found a value in the right list
      // which is smaller than the pivot element then we exchange the
      // values.
      // As we are done we can increase i and j
      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
      }
    }

    // Recursion
    if (low < j) {
      quickSortAscend(low, j);
    }
    if (i < high) {
      quickSortAscend(i, high);
    }

  }

  // Quick sort method for descending order
  private void quickSortDescend(int low, int high) {

    int i = low, j = high;
    // Get the pivot element from the middle of the list
    int pivot = items[low + (high - low) / 2].getItemId();

    // Divide into two lists
    while (i <= j) {
      // If the current value from the left list is larger than the pivot
      // element then get the next element from the left list
      while (items[i].getItemId() > pivot) {
        i++;
      }
      // If the current value from the right list is smaller than the pivot
      // element then get the next element from the right list
      while (items[j].getItemId() < pivot) {
        j--;
      }
      // If we have found a value in the left list which is smaller than
      // the pivot element and if we have found a value in the right list
      // which is larger than the pivot element then we exchange the
      // values.
      // As we are done we can increase i and j
      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
      }
    }

    // Recursion
    if (low < j) {
      quickSortDescend(low, j);
    }
    if (i < high) {
      quickSortDescend(i, high);
    }

  }

  // Swapping elements
  private void exchange(int i, int j) {
    CatalogueItem temp = items[i];
    items[i] = items[j];
    items[j] = temp;
  }

  // Prints the array
  void printArray(CatalogueItem arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(
              "Id: " + arr[i].getItemId() + ", "
              + "Name: " + arr[i].getItemName() + ", "
              + "Category: " + arr[i].getCategory() + "\n");
    }

    System.out.println();
    System.out.println();
  }

  public static void main(String args[]) {

    // New Quicksort instantiation  
    QuickSort ob = new QuickSort();

    // CatalogueItem array
    CatalogueItem arr[] = {
      new CatalogueItem(3, "Life of Pi", "Books"),
      new CatalogueItem(7, "Deelongie 4 way toaster", "Home and Kitchen"),
      new CatalogueItem(2, "Glorbarl knife set", "Home and Kitchen"),
      new CatalogueItem(4, "Diesorn vacuum cleaner", "Appliances"),
      new CatalogueItem(5, "Jennie Olivier sauce pan", "Home and Kitchen"),
      new CatalogueItem(6, "This book will save your life", "Books"),
      new CatalogueItem(9, "Kemwould hand mixer", "Appliances"),
      new CatalogueItem(1, "Java for Dummies", "Books"),};

    System.out.println("The unsorted array is:\n");
    ob.printArray(arr);                                                             // Print unsorted array

    long ascStartTime = System.nanoTime();                                          // Start timer
    ob.sortAsc(arr);                                                                // Sort array in ascending order by itemID
    long ascEndTime = System.nanoTime();                                            // End timer
    System.out.println("The array quick sorted in ascending order is:\n");
    ob.printArray(arr);                                                             // Print sorted array
    long ascTimeElapsed = (ascEndTime - ascStartTime);
    System.out.println("Execution time in nanoseconds: " + ascTimeElapsed + "\n");  // Print time elapsed for ascending sort method execution

    long descStartTime = System.nanoTime();                                         // Start timer
    ob.sortDesc(arr);                                                               // Sort array in descending order by itemID
    long descEndTime = System.nanoTime();                                           // End timer
    System.out.println("The array quick sorted in descending order is:\n");
    ob.printArray(arr);                                                             // Print sorted array
    long descTimeElapsed = (descEndTime - descStartTime);                           // Print time elapsed for descending sort method execution
    System.out.println("Execution time in nanoseconds: " + descTimeElapsed);

    System.out.println("\nThough variance in recorded times is observed between the ascending and descending sort method operations,"
            + "\ntheir time complexity is the same (worst case: O(n^2)), since they are both essentially performing the same task.");
  }

}
