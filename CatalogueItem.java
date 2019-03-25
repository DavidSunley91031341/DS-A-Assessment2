/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author 91031341
 */
public class CatalogueItem {

  private final Integer id;
  private final String itemName;
  private final String category;

  // getter methods
  public int getItemId() {
    return id;
  }

  public String getItemName() {
    return itemName;
  }

  public String getCategory() {
    return category;
  }

  // constructor
  public CatalogueItem(Integer newId, String newName, String newCategory) {

    this.id = newId;
    this.itemName = newName;
    this.category = newCategory;
  }
}
