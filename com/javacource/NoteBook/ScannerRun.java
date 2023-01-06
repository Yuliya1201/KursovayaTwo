package com.javacource.NoteBook;
import com.javacource.NoteBook.MyCalendar;

import java.util.Scanner;

public class ScannerRun implements Runnable {
    @Override
    public void run() {
        try  (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                System.out.println("Выберите пункт меню");
                printMenu();
                if (scanner.hasNext()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            MyCalendar.addTask(scanner);
                            break;
                        case 2:
                            MyCalendar.editTask(scanner);
                            break;
                        case 3:
                            MyCalendar.deleteTask(scanner);
                            break;
                        case 4:
                            MyCalendar.getTasksByDay(scanner);
                            break;
                        case 5:
                            MyCalendar.printArchivedTasks();
                            break;
                        case 6:
                            MyCalendar.getGroupedByDate();
                            break label;

                    }
                } else {
                    scanner.next();
                    System.out.println("Выбирете пункт меню из списка!");
                }
            }

        }
    }
    private static void printMenu() {
        System.out.println(
    "1. Добавить задачу" +
    "2. Редактировать задачу" +
    "3. Удалить задачу" +
    "4. Получить задачи на указанный день" +
    "5. Получить архивные задачи" +
    "6. Получить сгруппированные по датам задачи" +
    "0. Выход"
        );
    }
}
