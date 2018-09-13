package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Todo {

    private String text;
    private int priority;
    private Date dueDate;

    public Todo(String text, int priority, Date dueDate){
        this.text = text;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }




}
