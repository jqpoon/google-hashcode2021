package suffering;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.activation.ActivationGroup_Stub;
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
        writer.write(intersecNum + "\n");
        for(IntersecSchedule i : scheduleList){
            writer.write(i.getStreetNum() + "\n");
            writer.write(i.print());
        }
        writer.close();
        return file;
    }

    public static void main(String[] args) throws IOException {
        Schedule s = new Schedule();
        IntersecSchedule sc = new IntersecSchedule(1);
        sc.addStreetToSchedule(new Street("hello", 1,2,3), 2);
        sc.addStreetToSchedule(new Street("me", 3,4, 2), 1);
        s.addToSchedule(sc);
        Submission sub = new Submission(s);
        sub.createSubmissionFile();
    }
}
