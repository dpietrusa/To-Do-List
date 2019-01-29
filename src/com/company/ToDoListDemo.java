package com.company;

import java.util.Scanner;
public class ToDoListDemo {

    public static void main(String[] args) {

    ToDoList yourList = new ToDoList();
    boolean running = true;

    do {

        System.out.println("Welcome to Java To Do List 5000 Alpha: Please Select an Option.");
        System.out.println("1 - Add Item to List\n2 - Display Current Items in List\n3 - Display Current Items by State\n4 - Edit Existing Items\n5 - Delete Items");

        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();

        switch (choice) {
            case 1:
                if (yourList.hasRoom()) {
                    char anotherItem;

                    do {
                        ToDoListItem listItem = new ToDoListItem();
                        System.out.println("Please enter a description of your to do item:");
                        userInput.nextLine();
                        listItem.setDescription(userInput.nextLine());

                        System.out.println("Please enter the state of the item:\n1 - To Do\n2 - In Progress\n3 - Done");
                        int itemState = userInput.nextInt();

                        if (itemState == 1) {
                            listItem.setState("To Do");
                        } else if (itemState == 2) {
                            listItem.setState("In Progress");
                        } else if (itemState == 3) {
                            listItem.setState("Done");
                        } else {
                            System.out.println("Please Enter a Choice 1-3");
                        }

                        yourList.addItem(listItem);
                        if (yourList.listFull()) {
                            System.out.println("To Do List is Full! Please Re-prioritize.");
                            break;
                        }

                        System.out.println("Add Another Item to List? Y/N");
                        anotherItem = userInput.next().charAt(0);
                    } while ((anotherItem == 'y') || (anotherItem == 'Y') && (yourList.hasRoom()));


                } else {
                    System.out.println("To Do List is Full! Please Re-prioritize.");
                    break;
                }

        }


    }while (running);

    }
}
