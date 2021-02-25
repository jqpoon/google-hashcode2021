package suffering;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Submission {

    private final Schedule schedule;
    private List<IntersecSchedule> scheduleList;

    public Submission(Schedule schedule) {
        this.schedule = schedule;
        scheduleList = schedule.getSchedule();
    }

   public File createSubmissionFile() throws IOException {
        File file = new File("submission.txt");
        FileWriter writer = new FileWriter(file, true);
        int intersecNum = scheduleList.size();
        writer.write(int + "\n")


    }
}
