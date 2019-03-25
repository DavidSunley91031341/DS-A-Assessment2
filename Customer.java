/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

/**
 *
 * @author dsunl
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
}
