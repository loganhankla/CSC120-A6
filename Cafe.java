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
        this.nCoffeeOunces = 200.0;
        this.nSugarPackets = 175.0;
        this.nCreams = 109.0;
        this.nCups = 47.0;
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
                        //or should I just restock?
                        throw new RuntimeException("There are not enough cups in stock.");
                    }
                } else{ 
                    throw new RuntimeException("There is not enough cream in stock to fulfill this sale.");
                }
            } else{
                throw new RuntimeException("There are not enough sugar packets in stock.");
            }
        } else{
            throw new RuntimeException("There is not enough coffee in stock to fulfill this order.");
        }
        
        
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    public static void main(String[] args) {
        new Cafe();

        //try sellCoffee, catch and use restock -
    }
    
}
