//Carl Owen
//Exit ticket parent class
public class Automobile
{
    //Private attributes
    private String brand;
    private int year;

    //Constructor
    public Automobile(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    //Getter methods for accessing private attributes
    public String getBrand()
    {
        return brand;
    }

    public int getYear()
    {
        return year;
    }

    //Overriding the toString method
    @Override
    public String toString()
    {
        return "Automobile [Brand: " + brand + ", Year: " + year + "]";
    }
}

