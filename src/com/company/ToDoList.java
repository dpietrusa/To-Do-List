package com.company;

public class ToDoList {

    private ToDoListItem[] toDoListArray = new ToDoListItem[3];

    public int numberOfItems(){
        int itemsCount = 0;
        for (int i = 0; i < toDoListArray.length; i++) {
            if (toDoListArray[i] != null) {
                itemsCount++;
            }
        } return itemsCount;
    }


    public void addItem(ToDoListItem item) {
        for (int i = 0; i <= toDoListArray.length; i++) {
            if (toDoListArray[i] == null) {
                toDoListArray[i] = item;
            }
        }
    }

    public boolean listFull() {return numberOfItems() == toDoListArray.length;}

    public boolean hasRoom() {return !listFull();}

}
