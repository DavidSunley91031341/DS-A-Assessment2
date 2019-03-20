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

  /* Prints the array */
  void printArray(CatalogueItem arr[]) {
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
    JavaSort ob = new JavaSort();

    CatalogueItem arr[] = {
      new CatalogueItem(3, "Life of Pi", "Books"),
      new CatalogueItem(7, "Deelongie 4 way toaster", "Home and Kitchen"),
      new CatalogueItem(2, "Glorbarl knife set", "Home and Kitchen"),
      new CatalogueItem(4, "Diesorn vacuum cleaner", "Appliances"),
      new CatalogueItem(5, "Jennie Olivier sauce pan", "Home and Kitchen"),
      new CatalogueItem(6, "This book will save your life", "Books"),
      new CatalogueItem(9, "Kemwould hand mixer", "Appliances"),
      new CatalogueItem(1, "Java for Dummies", "Books"),};
    System.out.println("The Unsorted array is:");
    ob.printArray(arr);

    //apply sort
    Arrays.sort(arr);
    System.out.println("The array sorted by category using the Java built in sort() is:");
    ob.printArray(arr);
  }
}
