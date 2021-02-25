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

  public static void main(String[] args) throws IOException {

    System.out.println();
    List<String> lines = Files.readAllLines(
        Path.of(System.getProperty("user.dir") + "/resources/a.txt"),
        StandardCharsets.US_ASCII);

    String problemStatement = lines.get(0);
    String[] split = problemStatement.split("\\s+");
    int simulationTime = Integer.parseInt(split[0]);
    int intersectionCount = Integer.parseInt(split[1]);
    int streetCount = Integer.parseInt(split[2]);
    int carCount = Integer.parseInt(split[3]);
    int bonusPoint = Integer.parseInt(split[4]);

    Map<String, Street> streetsMap = new HashMap<>();
    List<Car> carsList = new ArrayList<>();

    String[] streetsString;
    int begin, end, length;
    String name, line;
    for (int i = 1; i < streetCount + 1; i++) {
      line = lines.get(i);
      streetsString = line.split("\\s+");
      begin =  Integer.parseInt(streetsString[0]);
      end = Integer.parseInt(streetsString[1]);
      name = streetsString[2];
      length = Integer.parseInt(streetsString[3]);

      Street street = new Street(name, begin, end, length);
      streetsMap.put(name, street);
    }

    String[] carsString;
    int streetsToVisit;
    for (int i = 1 + streetCount; i < carCount + 1 + streetCount; i++) {
      line = lines.get(i);
      carsString = line.split("\\s+");
      streetsToVisit = Integer.parseInt(carsString[0]);

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
    }

  }
}
