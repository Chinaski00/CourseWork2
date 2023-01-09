package task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SingleTime extends Task implements Repeat {
    public SingleTime(String name, String description, boolean workIs, LocalDateTime dateAndTime) {
        super(name, description,  workIs, dateAndTime);
    }

    @Override
    public boolean checkSuitable(LocalDate dateAndTime) {
        return false;
    }
}