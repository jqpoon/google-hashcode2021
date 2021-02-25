package suffering;

import java.util.List;

public class Car {

  private int streetCount;
  private final List<String> streetNames;
  private int currentStreetNum;
  private String currentStreet;

  public Car(int streetCount, List<String> streetNames) {
    this.streetCount = streetCount;
    this.streetNames = streetNames;
    currentStreet = streetNames.get(0);
  }

  public int getStreetCount() {
    return streetCount;
  }

  public void setStreetCount(int streetCount) {
    this.streetCount = streetCount;
  }

  public String getCurrentStreet() {
    return currentStreet;
  }

  public void setCurrentStreet(int currentStreetNum) {
    this.currentStreet = streetNames.get(currentStreetNum);
    this.currentStreetNum = currentStreetNum;
  }

  public void advance() {
    setCurrentStreet(currentStreetNum + 1);
  }

  public List<String> getStreetNames() {
    return streetNames;
  }
}
