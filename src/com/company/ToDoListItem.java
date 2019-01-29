package com.company;

public class ToDoListItem {

    private String description;
    private String state;


    public void setDescription(String itemDescription) {
        description = itemDescription;
    }
    public String getDescription() {return description;}


    public void setState(String itemState) {
        state = itemState;
    }
    public String getState() {return state;}


    public String getDetails() {
        return ("Item Description: " + description + "\nItem State:" + state);
    }








}


