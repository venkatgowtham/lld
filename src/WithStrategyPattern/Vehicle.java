package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy d;

    public Vehicle(DriveStrategy ds)
    {
        this.d = ds;
    }

    public void drive()
    {
        d.drive();
    }

}
