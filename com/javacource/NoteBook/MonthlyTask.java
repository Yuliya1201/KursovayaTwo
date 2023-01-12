package com.javacource.NoteBook;
import com.javacource.NoteBook.WrongInputException;
import java.time.LocalDateTime;

public class MonthlyTask extends Task implements Repeatable {
    public MonthlyTask(String title,String description,TaskType taskType,LocalDateTime date) throws
            WrongInputException {
        super(title,description,taskType,date);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestedDate) {
        return getFirstDate().getMonth().equals(requestedDate.getMonth());
    }
     Date date = new Date();
    System.out.prinf("%1$s %2$td %2$tB %2$tY","Дата:",date);
}
