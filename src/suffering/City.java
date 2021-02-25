package suffering;

import java.util.HashMap;
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

  public void generateSchedule() {
    for (Intersection i : intersections.values()) {
      IntersecSchedule schedule = new IntersecSchedule(i.getId());
      for (Street s : i.getIncoming()) {
        //for each incoming street, add to schedule according to ratio of cars

      }
    }
  }

  public HashMap<Street, Integer> generateTimings(HashMap<Street, Integer> map) {
    //input: A - 4, B - 2
    // output: A - 2, B - 1
    return null;
  }
}
