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

    public void setStreets(Map<Street, Integer> streets) {
        this.streets = streets;
    }

    public void addStreetToSchedule(Street street, int i){
        streets.put(street,i);
    }

    public String getStreetNum(){
        return String.valueOf(streets.size());
    }

    public String print(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id);
        stringBuilder.append("\n");
        stringBuilder.append(getStreetNum());
        stringBuilder.append("\n");
        for(var entry: streets.entrySet()){
            stringBuilder.append(entry.getKey().getName());
            stringBuilder.append(" ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
