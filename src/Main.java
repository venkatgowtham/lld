import WithStrategyPattern.SchoolVehicle;
import WithStrategyPattern.SportsVehicle;
import WithStrategyPattern.Strategy.NormalDrive;
import WithStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        Vehicle vehicle_2 = new SchoolVehicle();

        vehicle.drive();
        vehicle_2.drive();
    }
}