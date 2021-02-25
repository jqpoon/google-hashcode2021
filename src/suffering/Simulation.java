package suffering;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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

    List<Street> streetsList = new ArrayList<>();

    int begin, end, length;
    String name;
    for (int i = 1; i < streetCount + 1; i++) {
      String line = lines.get(i);
      System.out.println(line);
      String[] streetsString = line.split("\\s+");
      begin =  Integer.parseInt(streetsString[0]);
      end = Integer.parseInt(streetsString[1]);
      name = streetsString[2];
      length = Integer.parseInt(streetsString[3]);
    }

    for (int i = 1 + streetCount; i < carCount + 1 + streetCount; i++) {
      String line = lines.get(i);
//      System.out.println(line);
    }
    
  }
}
