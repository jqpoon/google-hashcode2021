import java.util.List;

public class City {
  private final int simulationTime;
  private final int bonusPoints;
  private final List<Intersection> intersections;
  private final List<Street> streets;
  private final List<Car> cars;

  public City(int simulationTime, int bonusPoints,
      List<Intersection> intersections, List<Street> streets,
      List<Car> cars) {
    this.simulationTime = simulationTime;
    this.bonusPoints = bonusPoints;
    this.intersections = intersections;
    this.streets = streets;
    this.cars = cars;
  }

}
