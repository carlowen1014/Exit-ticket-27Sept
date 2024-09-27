//Carl Owen
//Exit ticket main driver class
public class Driver
{
    public static void main(String[] args)
    {
        //Create an array of Vehicle objects
        Automobile[] automobiles = new Automobile[5];

        //Add instances of Car and Truck
        automobiles[0] = new Car("Toyota", 2020, 4, 30.5);
        automobiles[1] = new Car("Honda", 2018, 2, 25.0);
        automobiles[2] = new Truck("Ford", 2015, 5.0, true);
        automobiles[3] = new Truck("Chevrolet", 2019, 4.0, false);
        automobiles[4] = new Car("Tesla", 2022, 4, 120.0);

        //Loop through the array and print each object
        for (Automobile automobile : automobiles) {
            System.out.println(automobile);
        }
    }
}