public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    /** The Building constructor creates a new Building. The Building class also serves as a superclass.
     * @param name The name of the Building
     * @param address The address of the Building
     * @param nFloors The number of floors in the Building
     * @throws RuntimeException
    */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /** This getter function retrieves the name of the Building.
     * @return Building name
     */
    public String getName() {
        return this.name;
    }

    /** This getter retrieves the address of the Building.
     * @return Building address
     */
    public String getAddress() {
        return this.address;
    }

    /** This getter retrieves the number of floors in the Building.
     * @return Number of floors in Building
     */
    public int getFloors() {
        return this.nFloors;
    }

    /** This toString function creates a basic description of the Building.
     * @return Building description
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address + ".";
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}