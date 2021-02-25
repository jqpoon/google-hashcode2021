package suffering;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulation {

  public static City generateCity(String t) throws IOException {
    List<String> lines = Files.readAllLines(
        Path.of(System.getProperty("user.dir") + "/resources/" + t + ".txt"),
        StandardCharsets.US_ASCII);

    String problemStatement = lines.get(0);
    String[] split = problemStatement.split("\\s+");
    int simulationTime = Integer.parseInt(split[0]);
    int intersectionCount = Integer.parseInt(split[1]);
    int streetCount = Integer.parseInt(split[2]);
    int carCount = Integer.parseInt(split[3]);
    int bonusPoint = Integer.parseInt(split[4]);

    City city = new City(simulationTime, bonusPoint);

    Map<Integer, Intersection> intersectionMap = new HashMap<>();
    Map<String, Street> streetsMap = new HashMap<>();
    List<Car> carsList = new ArrayList<>();

    city.setStreets(streetsMap);
    city.setCars(carsList);
    city.setIntersections(intersectionMap);

    /* Generate streets. */
    for (int i = 1; i < streetCount + 1; i++) {
      String line = lines.get(i);
      String[] streetsString = line.split("\\s+");
      int begin = Integer.parseInt(streetsString[0]);
      int end = Integer.parseInt(streetsString[1]);
      String name = streetsString[2];
      int length = Integer.parseInt(streetsString[3]);

      Street street = new Street(name, begin, end, length);
      streetsMap.put(name, street);
    }

    /* Generate cars. */
    for (int i = 1 + streetCount; i < carCount + 1 + streetCount; i++) {
      String line = lines.get(i);
      String[] carsString = line.split("\\s+");
      int streetsToVisit = Integer.parseInt(carsString[0]);

      Street st;
      String stName;
      List<Street> carStreets = new ArrayList<>();

      for (int j = 0; j < streetsToVisit; j++) {
        stName = carsString[j + 1];
        st = streetsMap.get(stName);
        carStreets.add(st);
      }

      Car car = new Car(streetsToVisit, carStreets);
      carsList.add(car);

      /* Add car to the street it starts in. */
      stName = carsString[1];
      Street startingStreet = streetsMap.get(stName);
      startingStreet.getCars().add(car);
    }

    /* Generate intersections. */
    for (int i = 0; i < intersectionCount; i++) {
      Intersection intersection = new Intersection(i);
      intersectionMap.put(i, intersection);
    }

    for (var entry : streetsMap.entrySet()) {
      Street street = entry.getValue();
      int interStart = street.getInterStart();
      int interEnd = street.getInterEnd();

      /* Add a new intersection if it doesn't exist. */
      if (!intersectionMap.containsKey(interStart) || !intersectionMap.containsKey(interEnd)) {
        throw new IllegalStateException("Intersection doesn't exist!");
      }

      /* Add this street to its connecting intersections. */
      Intersection start = intersectionMap.get(interStart);
      start.getOutgoing().add(street);

      Intersection end = intersectionMap.get(interEnd);
      end.getIncoming().add(street);
    }

    return city;
  }

  public static void main(String[] args) throws IOException {
    City city = generateCity("a");
    Schedule schedule = city.generateSchedule();
    Submission submission = new Submission(schedule);
    submission.createSubmissionFile("a_submission");
  }

}
