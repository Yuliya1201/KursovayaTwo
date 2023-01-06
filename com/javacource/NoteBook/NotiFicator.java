package com.javacource.NoteBook;

import java.time.LocalDate;
import java.util.List;

public class NotiFicator implements Runnable {
    @Override
    public void run() {
        int i = 30;
        while (i > 0) {
            try {
                i --;
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<Repeatable> taskByDate = MyCalendar.findTasksByDate(LocalDate.now());
            if (!taskByDate.isEmpty()) {
                System.out.println("У тебя есть задачи на сегодня");
                System.out.println(taskByDate);
            }
        }
    }
}
