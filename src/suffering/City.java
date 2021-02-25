package suffering;

import java.util.List;
import java.util.Map;

public class City {

  private final int simulationTime;
  private final int bonusPoints;
  private Map<Integer, Intersection> intersections;
  private Map<String, Street> streets;
  private List<Car> cars;

  public City(int simulationTime, int bonusPoints) {
    this.simulationTime = simulationTime;
    this.bonusPoints = bonusPoints;
  }

  public Map<String, Street> getStreets() {
    return streets;
  }

  public void setStreets(Map<String, Street> streets) {
    this.streets = streets;
  }

  public List<Car> getCars() {
    return cars;
  }

  public void setCars(List<Car> cars) {
    this.cars = cars;
  }

  public Map<Integer, Intersection> getIntersections() {
    return intersections;
  }

  public void setIntersections(
      Map<Integer, Intersection> intersections) {
    this.intersections = intersections;
  }
}
