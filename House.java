/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {
// in class added "extends Building"
  
  private ArrayList<String> residents; //in class
  private boolean hasDiningRoom; //in class


  public House(String name, String address, int nFloors, boolean diningRoom) {
    //System.out.println("You have built a house: 🏠");
    super(name, address, nFloors); //in class
    this.residents = new ArrayList<String>(); //class
    this.hasDiningRoom = diningRoom; //class
  }

  public String toString() {
    String description = super.toString();
    description += " There are currently" + this.residents.size() + "residents in this house.";
    description += "This house";
    if (this.hasDiningRoom){
      description += " has";

    } else {
      description += " does not have";
    }
    description += " a dining room.";
    return description;
  }
  public static void main(String[] args) {
    //new House();
    House wilson = new House("Wilson House", "16 Kensington Ave", 4);
  }

}