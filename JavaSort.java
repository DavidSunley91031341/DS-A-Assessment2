/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.util.Arrays;

/**
 *
 * @author 91031341
 */
public class JavaSort {

  // Prints the array
  void printArray(CatalogueItemJS arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(
              "id: " + arr[i].getItemId() + " "
              + "name: " + arr[i].getItemName() + " "
              + "category: " + arr[i].getCategory() + "\n");
    }
    System.out.println();
    System.out.println();
  }

  // Driver method to test above
  public static void main(String args[]) {

    // New JavaSort instantiation
    JavaSort ob = new JavaSort();

    // CatalogueItem array
    CatalogueItemJS arr[] = {
      new CatalogueItemJS(3, "Life of Pi", "Books"),
      new CatalogueItemJS(7, "Deelongie 4 way toaster", "Home and Kitchen"),
      new CatalogueItemJS(2, "Glorbarl knife set", "Home and Kitchen"),
      new CatalogueItemJS(4, "Diesorn vacuum cleaner", "Appliances"),
      new CatalogueItemJS(5, "Jennie Olivier sauce pan", "Home and Kitchen"),
      new CatalogueItemJS(6, "This book will save your life", "Books"),
      new CatalogueItemJS(9, "Kemwould hand mixer", "Appliances"),
      new CatalogueItemJS(1, "Java for Dummies", "Books"),};

    System.out.println("The unsorted array is:\n");
    // Prints unsorted array
    ob.printArray(arr);

    // Applying built in JavaSort
    Arrays.sort(arr);
    System.out.println("The array sorted by category using the Java built in sort() is:\n");
    // Prints sorted array
    ob.printArray(arr);

    System.out.println("Java's built in sort() method uses a Dual-Pivot Quicksort algorithm, which has a best and average case time complexity of O(n log(n)), and a worst case of O(n^2)."
            + "\nTraditional Quicksort uses a single pivot to partition the array into two sections (less than the pivot, and greater than the pivot), "
            + "\nwhereas the Double-Pivot variation utilises two pivots to partition the array into three sections: less than the left pivot, greater than the left pivot "
            + "\nbut less than the right pivot, and greater than the right pivot. "
            + "\n\nBubble sort is a comparison-based algorithm in which each pair of adjacent elements is compared and the elements are swapped if they are not in order."
            + "\nBubble sort has an average and worst case time compexity of O(n^2), and a best case of O(n)."
            + "\n\nOverall, Java's sort() method is more efficient than Bubble sort. Ignoring the unlikely best case scenario of an array already being sorted (O(n)), Bubble sort is dragged down"
            + "\nby its average case complexity of O(n^2), versus Dual-pivot Quicksort's O(n log(n)). In most cases dividing a problem and conquering it's sections independently from"
            + "\none another is fundamentally going to be faster than iterating through an array element by element.");
  }
}
