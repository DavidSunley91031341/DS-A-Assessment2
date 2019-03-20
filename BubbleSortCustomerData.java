/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

/**
 *
 * @author 91031341
 */
public class BubbleSortCustomerData {

  //
  void bubbleSwap(Customer arr[], int i, int j) {
    Customer temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  void bubbleSortRating(Customer arr[]) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j].getRating() > arr[j + 1].getRating()) {
          bubbleSwap(arr, j, j + 1);
        }
        if (arr[j].getRating() == arr[j + 1].getRating()) {
          if (arr[j].getName().compareToIgnoreCase(arr[j + 1].getName()) < 0) {     // Descending
            bubbleSwap(arr, j, j + 1);
          }
        }
      }
    }

  }

  void printArray(Customer arr[]) {

    int n = arr.length;

    for (int i = 0; i < n; ++i) {
      System.out.print(arr[i].getName() + ": " + arr[i].getRating() + "\n");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    BubbleSortCustomerData bs = new BubbleSortCustomerData();

    Customer arr[] = {
      new Customer("Tama", 2, "Auckland"),
      new Customer("Amelia", 5, "Taranaki"),
      new Customer("Kaos", 3, "Hamilton"),
      new Customer("Karl", 4, "Papatoetoe"),
      new Customer("Carlos", 5, "Glenfield"),
      new Customer("Alicia", 4, "Whangarei"),
      new Customer("Zion", 2, "Wellington"),
      new Customer("Sara", 2, "Auckland"),
      new Customer("Bob", 4, "Papakura"),
      new Customer("Wiremu", 5, "Auckland"),};

    System.out.println("The unsorted array of customers is:");

    bs.printArray(arr);

    bs.bubbleSortRating(arr);

    System.out.println("Customer array bubble sorted by rating in ascending order, then by name in descending order:");

    bs.printArray(arr);

  }
}
