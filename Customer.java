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
public class Customer {

  private String name;

  private int rating;

  private String address;

  public String getName() {
    return name;
  }

  public int getRating() {
    return rating;
  }

  public String getAddress() {
    return address;
  }

  public Customer(String newName, int newRating, String newAddress) {

    name = newName;
    rating = newRating;
    address = newAddress;
  }

//  public int compareTo(Customer arr) {
//    int customerCompare = this.getName().compareTo(arr.getName());
//    if (customerCompare != 0) {
//      return customerCompare;
//    } else {
//      if (this.getName().compareTo(arr.getName()) < 0) {
//        return -1;
//      }
//      if (this.getName().compareTo(arr.getName()) > 0) {
//        return 1;
//      }
//    }
//    return 0;
//  }
}
