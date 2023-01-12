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
     Date date = new Date();
    System.out.prinf("%1$s %2$td %2$tB %2$tY","Дата:",date);
}
