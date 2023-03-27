/**
 * Filename: Library.java
 * Description: The Library class is a subclass of the Building superclass. It stores information about the building and book collection.
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
    if(containsTitle(title)){
      this.collection.remove(title);
      return title;
    } else{
      throw new RuntimeException("This book is not currently in the collection.");
    }
  }

  public void checkOut(String title){
    if(isAvailable(title)){
      this.collection.replace(title, false);
    } else{
      throw new RuntimeException("This book is not currently available.");
    }
  }

  public void returnBook(String title){
    if(containsTitle(title)){
      this.collection.replace(title, true);
    } else{
      throw new RuntimeException("This book is not currently part of the library's collection.");
    }
  }

  public boolean containsTitle(String title){
    return this.collection.containsKey(title);
  }

  public boolean isAvailable(String title){
    if(this.collection.get(title)){
      return true;
    } else{
      return false;
    }
  }

  public void printCollection(){
    for(String title : this.collection.keySet()){
      System.out.println("Title: " + title + " | Available: " + this.collection.get(title));
    }
  }

  public static void main(String[] args) {
    Library neilson = new Library("Neilson Library", "1 Chapin Way", 4);
    neilson.addTitle("Great Expectations");
    neilson.addTitle("On Such a Full Sea");
    neilson.addTitle("The Other Black Girl");
    neilson.printCollection();
    neilson.removeTitle("Great Expectations");
    neilson.checkOut("On Such a Full Sea");
    neilson.checkOut("The Other Black Girl");
    neilson.returnBook("On Such a Full Sea");
    System.out.println("Second print: ");
    neilson.printCollection();
  }
  
}