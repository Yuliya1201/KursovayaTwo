package com.javacource.NoteBook;
import java.time.LocalDateTime;
import com.javacource.NoteBook.WrongInputException;

public class YearlyTask extends Task implements Repeatable {
    public YearlyTask(String title,String description,TaskType taskType,LocalDateTime date) throws
            WrongInputException {
        super(title,description,taskType,date);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestedDate) {
        return getFirstDate().getYear()==requestedDate.getYear();
    }
}
