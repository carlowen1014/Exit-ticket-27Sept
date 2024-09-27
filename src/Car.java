//Carl Owen
//Exit ticket car child class
public class Car extends Automobile
{
    private int doors;
    private double fuelEfficiency;

    //Constructor
    public Car(String brand, int year, int doors, double fuelEfficiency)
    {
        super(brand, year); // Call to the parent constructor
        this.doors = doors;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public String toString()
    {
        return "Car [Brand: " + getBrand() + ", Year: " + getYear() +
                ", Doors: " + doors + ", Fuel Efficiency: " + fuelEfficiency + " mpg]";
    }
}

