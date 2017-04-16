package cycling;

import bike.Bike;
import bike.CityCycle;
import bike.CrossBike;
import bike.RoadBike;

import java.util.ArrayList;
import java.util.List;

/**
 * 自転車
 */
public class CyclingApplication {

    public static void main(String[] args) {

        Bike cityCycle = new CityCycle();
        Bike crossBike = new CrossBike();
        Bike roadBike = new RoadBike();

        List<Bike> bikes = new ArrayList<>();
        bikes.add(cityCycle);
        bikes.add(crossBike);
        bikes.add(roadBike);

        bikes.stream()
                .forEach(bike -> {
                    bike.ride();
                    bike.changeGear(Bike.ChangingGear.UP);
                    bike.changeGear(Bike.ChangingGear.DOWN);
                    bike.brake();
                });
    }
}
