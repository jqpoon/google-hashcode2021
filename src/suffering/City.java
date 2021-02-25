package suffering;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

  public Schedule generateSchedule() {
    Schedule finalSchedule = new Schedule();
    for (Intersection i : intersections.values()) {
      IntersecSchedule schedule = new IntersecSchedule(i.getId());
      HashMap<Street, Integer> map = new HashMap<>();
      for (Street s : i.getIncoming()) {
        //for each incoming street, add to schedule according to ratio of cars
        map.put(s, s.getCars().size());
      }
      map = generateTimings(map);
      schedule.setStreets(map);
      finalSchedule.addToSchedule(schedule);
    }
    return finalSchedule;
  }

  public HashMap<Street, Integer> generateTimings(HashMap<Street, Integer> inputMap) {

    if (inputMap.isEmpty()) {
      return inputMap;
    }

    Integer min = Collections.min(inputMap.values());
    if (min == 0) {
      min = 1;
    }

    for (var entry : inputMap.entrySet()) {
      Street street = entry.getKey();
      Integer value = entry.getValue();
      Integer newValue = value / min;
      inputMap.put(street, newValue);
    }

    return inputMap;
  }
}
