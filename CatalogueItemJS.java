/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

/**
 *
 * @author 91031341
 */
// Implementing comparable interface to support the built in sort() method
class CatalogueItemJS implements Comparable<CatalogueItemJS> {

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
  public CatalogueItemJS(Integer newId, String newName, String newCategory) {

    id = newId;
    itemName = newName;
    category = newCategory;
  }

  @Override
  public int compareTo(CatalogueItemJS other) {
    return Integer.compare(this.id, other.id);
  }

}
