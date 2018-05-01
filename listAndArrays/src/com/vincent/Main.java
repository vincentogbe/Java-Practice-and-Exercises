package com.vincent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GR foodlist = new GR();
    public static void main(String[] args) {
	// write your code here

        boolean quit = false;
        int choice = 0;
        printinstructions();
        while (!quit) {
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 0:
                    printinstructions();
                    break;
                case 1:
                    foodlist.pritfood();
                    break;

                case 2:

                    additem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:

                    remove();
                    break;
                case 5:
                    searchitem();
                    break;

                case 6:
                    proceddArrayList();

                case 7:
                    quit = true;

                    break;

            }

        }

    }
    public static void printinstructions(){
        System.out.println("\n press ");
        System.out.println("\t 0 - to print choice option. ");
        System.out.println("\t 1 - to print the last of thr food items ");
        System.out.println("\t 2 - to add an item to the list ");
        System.out.println("\t 3 - to modify an item in the list ");
        System.out.println("\t 4 - to remove an item from the last ");
        System.out.println("\t 5 - to search for an item in the list ");
        System.out.println("\t 6 - to quit the appication ");
    }

    public static void additem(){
        System.out.print("please enter the grocery item: ");
        foodlist.addFood(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("current item number: ");
        String itemno = scanner.nextLine();
        System.out.print("enter new item");
        String newIitem = scanner.nextLine();
        foodlist.modifyfoodkist(itemno, newIitem);
    }
    public static void remove(){
        System.out.print("enter item number: ");
        String itemno = scanner.nextLine();
        scanner.nextLine();
        foodlist.removefoodlist(itemno);

    }
    public static void searchitem(){

        System.out.println("enter item to search for: ");
        String searchitem = scanner.nextLine();
        if (foodlist.onFile(searchitem)){
            System.out.println("food " + searchitem + "in our foods list ");
        }
        else{
            System.out.println(searchitem + "is not in the list ");
        }

    }
    public static void proceddArrayList(){
        ArrayList<String>newArray = new ArrayList<String>();
        newArray.addAll(foodlist.getFoodList());
        
        ArrayList<String>nextArray = new ArrayList<String>(foodlist.getFoodList());

        String[] myArray = new String[foodlist.getFoodList().size()];
        myArray = foodlist.getFoodList().toArray(myArray);

    }
}
