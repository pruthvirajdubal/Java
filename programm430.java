class Vehicle
{
    void calculateRent(int day)
    {
        System.out.println("Generic vehicle rant");
    }
}
class Car extends Vehicle
{
    @Override
    void calculateRent(int day)
    {
        System.out.println("Car rent:"+(day *1500)); //3
    }
}
class Bike extends Vehicle
{
    @Override
    void calculateRent(int day)
    {
        System.out.println("Bike rent:"+(day*500)); //6
    }
}
class Truck extends Vehicle
{
    @Override
    void calculateRent(int day)
    {
        System.out.println("Truck rent:"+(day *3000)); //5
    }
}

public class programm430 {
    public static void main(String[] args) {

        Vehicle v;
        
        v = new Car();
        v.calculateRent(3);

        v = new Bike();
        v.calculateRent(6);

        v = new Truck();
        v.calculateRent(5);
        
    }
    
}
