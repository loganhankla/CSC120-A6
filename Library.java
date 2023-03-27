/**
 * Filename: Library.java
 * Description: The Library class is a subclass of the Building superclass. It XXX
 * @author Logan Hankla
 * Date: March 2023
 */

import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a library: 📖");
    this.collection = new Hashtable<String, Boolean>();
  }

  public void addTitle(String title){
    this.collection.put(title, true);
  }

  public String removeTitle(String title){
    this.collection.remove(title);
    return title;
  }

  public void checkOut(String title){
    this.collection.replace(title, true, false);
  }

  public void returnBook(String title){
    this.collection.replace(title, false, true);
  }

  public boolean containsTitle(String title){
    if(this.collection.contains(title)){
      return true;
    } else{
      return false;
    }
  }

  public boolean isAvailable(String title){

  }

  public void printCollection(){
    
  }

  public static void main(String[] args) {
    new Library();
  }
  
}