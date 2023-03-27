/**
 * Filename: House.java
 * Description: The House class is a subclass of the superclass, Building. It stores information about the house & residents.
 * @author Logan Hankla
 * Date: March 2023
 */

import java.util.ArrayList;

public class House extends Building {
  
  private ArrayList<String> residents; 
  private boolean hasDiningRoom; 

  public House(String name, String address, int nFloors, boolean diningRoom) {
    //System.out.println("You have built a house: 🏠");
    super(name, address, nFloors); 
    this.residents = new ArrayList<String>(); 
    this.hasDiningRoom = diningRoom; 
  }

  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name){ 
    this.residents.add(name);
  }

  public String moveOut(String name){ 
    if(isResident(name)){
      this.residents.remove(name);
      return name;
    } else{
      throw new RuntimeException("This person does not live in this house.");
    }
  }

  public boolean isResident(String person){ 
    if(this.residents.contains(person)){
      return true;
    } else{
      return false;
    }
  }

  public String toString() {
    String description = super.toString();
    description += " There are currently " + this.residents.size() + " residents in this house. ";
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
    House wilson = new House("Wilson House", "16 Kensington Ave", 4, true);
    //wilson.moveIn("Claire");
    //wilson.isResident("Claire");
    //wilson.moveOut("Claire");
    System.out.println(wilson);
  }

}


//Questions:
// * how to check residents?
// * how to try/catch exception?