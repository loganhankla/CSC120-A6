/**
 * Filename: House.java
 * Description: The House class is a subclass of the superclass, Building. It stores information about the house & residents.
 * @author Logan Hankla
 * Date: March 2023
 */

import java.util.ArrayList;

public class House extends Building {
// in class added "extends Building"
  
  private ArrayList<String> residents; 
  private boolean hasDiningRoom; 


  public House(String name, String address, int nFloors, boolean diningRoom) {
    //System.out.println("You have built a house: 🏠");
    super(name, address, nFloors); 
    this.residents = new ArrayList<String>(); 
    this.hasDiningRoom = diningRoom; 
    this.nResidents = residents.size(); //check
  }

  public void moveIn(String name){ //check
    this.residents.add(name);
  }

  public String moveOut(String name){ //check
    if(this.residents.contains(name)){
      this.residents.remove(name);
      return name;
    } else{
      throw new RuntimeException("This person does not live in this house.");
    }
  }

  public boolean isResident(String person){ //check
    if(this.residents.contains(person)){
      return true;
    } else{
      return false;
    }
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
    House wilson = new House("Wilson House", "16 Kensington Ave", 4, true);
  }

}