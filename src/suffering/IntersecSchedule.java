package suffering;

import java.util.HashMap;
import java.util.Map;

public class IntersecSchedule {

    // Intersection id
    private final int id;
    // Hashmap of street name to how long each street will have a green light.
    private Map<Street, Integer> streets;

    public IntersecSchedule(int id) {
        this.id = id;
        streets = new HashMap<>();
    }

    public void addStreetToSchedule(Street street, int i){
        streets.put(street,i);
    }
}
