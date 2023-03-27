/**
 * Filename: Cafe.java
 * Description: The Cafe class is a subclass of the superclass, Building. It stores information about the building and cafe inventory.
 * @author Logan Hankla
 * Date: March 2023
 */

 public class Cafe extends Building {

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
    
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = 200;
        this.nSugarPackets = 175;
        this.nCreams = 109;
        this.nCups = 47;
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces >= size){
            if(this.nSugarPackets >= nSugarPackets){
                if(this.nCreams >= nCreams){
                    if(this.nCups >= 1){
                        this.nCoffeeOunces -= size;
                        this.nSugarPackets -= nSugarPackets;
                        this.nCreams -= nCreams;
                        this.nCups -= 1;
                    } else{
                        this.restock(0, 0, 0, 47);
                    }
                } else{ 
                    this.restock(0, 0, 109, 0);
                }
            } else{
                this.restock(0, 175, 0, 0);
            }
        } else{
            this.restock(200, 0, 0, 0);
        }
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    public static void main(String[] args) {
        Cafe compass = new Cafe("Compass Cafe", "2 Chapin Way", 1);
        compass.sellCoffee(6, 2, 2);
        compass.sellCoffee(53, 2, 68);
        compass.sellCoffee(100, 56, 55);
        System.out.println("Coffee in Stock (oz): " + compass.nCoffeeOunces);
        System.out.println("Sugar in Stock: " + compass.nSugarPackets);
        System.out.println("Creams in Stock: " + compass.nCreams);
        System.out.println("Cups in Stock: " + compass.nCups);
    }
    
}
