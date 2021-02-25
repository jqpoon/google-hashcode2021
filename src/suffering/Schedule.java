package suffering;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<IntersecSchedule> schedule;

    public Schedule() {
        this.schedule = new ArrayList<>();
    }

    public void addToSchedule(IntersecSchedule intersecSchedule){
        schedule.add(intersecSchedule);
    }

    public List<IntersecSchedule> getSchedule() {
        return schedule;
    }
}
