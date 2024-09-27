//Carl Owen
//Exit ticket Truck child class
public class Truck extends Automobile
{
    private double loadCapacity;
    private boolean offRoadCapable;

    //Constructor
    public Truck(String brand, int year, double loadCapacity, boolean offRoadCapable)
    {
        super(brand, year); // Call to the parent constructor
        this.loadCapacity = loadCapacity;
        this.offRoadCapable = offRoadCapable;
    }

    @Override
    public String toString()
    {
        return "Truck [Brand: " + getBrand() + ", Year: " + getYear() +
                ", Load Capacity: " + loadCapacity + " tons" +
                ", Off-road Capable: " + offRoadCapable + "]";
    }
}

