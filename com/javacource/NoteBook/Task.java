package com.javacource.NoteBook;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {
    private String title;
    private String description;
    private TaskType taskType;
    private LocalDateTime firstDate;
    private boolean archived;
    private static Integer counter = 1;
    private final Integer id;

    public Task(String title, String description, TaskType taskType, LocalDateTime localDateTime) throws
            WrongInputException {
        this.title = ValidateUtils.checkString(title);
        this.description = ValidateUtils.checkString(description);
        this.taskType = taskType;
        this.firstDate = localDateTime;
        this.archived = false;
        id = counter++;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public LocalDateTime getFirstDate() {
        return firstDate;
    }

    public boolean isArchived() {
        return archived;
    }

    public Integer getId() {
        return id;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFirstDate(LocalDateTime firstDate) {
        this.firstDate = firstDate;
    }

    public static void setCounter(Integer counter) {
        Task.counter = counter;
    }

    public static Integer getCounter() {
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return archived == task.archived && title.equals(task.title) && description.equals(task.description) && taskType == task.taskType && firstDate.equals(task.firstDate) && id.equals(task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, taskType, firstDate, archived, id);
    }

    @Override
    public String toString() {
        return "Task{" + "title='" + title + '\'' + ", description='" + description + '\'' +
                ", taskType " + taskType + ", firstDate=" + firstDate + ", isArchived=" + archived +
                ", id=" + id + '}';
    }
}

