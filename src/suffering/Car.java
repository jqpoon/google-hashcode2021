package suffering;

import java.util.List;

public class Car {

  private int streetCount;
  private final List<Street> streets;
  private int currentStreetNum;
  private Street currentStreet;

  public Car(int streetCount, List<Street> streets) {
    this.streetCount = streetCount;
    this.streets = streets;
    currentStreet = streets.get(0);
  }

  public int getStreetCount() {
    return streetCount;
  }

  public void setStreetCount(int streetCount) {
    this.streetCount = streetCount;
  }

  public Street getCurrentStreet() {
    return currentStreet;
  }

  public void setCurrentStreet(int currentStreetNum) {
    this.currentStreet = streets.get(currentStreetNum);
    this.currentStreetNum = currentStreetNum;
  }

  public void advance() {
    setCurrentStreet(currentStreetNum + 1);
  }

  public Street getNextStreet() {
    return streets.get(currentStreetNum + 1);
  }

  public List<Street> getStreets() {
    return streets;
  }
}
