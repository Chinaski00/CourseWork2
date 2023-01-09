package task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Daily extends Task {

    public Daily(String name, String description, boolean workIs, LocalDateTime dateAndTime) {
        super(name, description, workIs, dateAndTime);

    }
    @Override
    public boolean checkSuitable(LocalDate date) {
        return date.isAfter(dateAndTime.toLocalDate());
    }
}