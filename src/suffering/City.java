package suffering;

import java.util.List;
import java.util.Map;

public class City {

  private final int simulationTime;
  private final int bonusPoints;
  private final Map<Integer, Intersection> intersections;
  private final Map<String, Street> streets;
  private final List<Car> cars;

  public City(int simulationTime, int bonusPoints,
      Map<Integer, Intersection> intersections, Map<String, Street> streets,
      List<Car> cars) {
    this.simulationTime = simulationTime;
    this.bonusPoints = bonusPoints;
    this.intersections = intersections;
    this.streets = streets;
    this.cars = cars;
  }

}
