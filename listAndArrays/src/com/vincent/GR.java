package com.vincent;

import java.util.ArrayList;

public class GR {


    public ArrayList<String> getFoodList() {
        return foodList;
    }

    private ArrayList<String> foodList = new ArrayList<String>();

    public void addFood (String item){

        foodList.add(item);

    }

    public void  pritfood(){
        System.out.println("you have " + foodList.size()+" items in your food list");
        for (int i = 0; i < foodList.size(); i ++)
        {
            System.out.println((i+1) + " , " + foodList.get(i));
        }
    }
    public void modifyfoodkist(String currentitem ,String newItem){
        int postion = findItem(currentitem);
        if (postion>= 0){
            modifyfoodkist(postion,newItem);
        }
    }
    private void modifyfoodkist(int postion, String newItem){
        foodList.set(postion,newItem);
        System.out.println("food item " + (postion+1)+ "has been been modifiyed");
    }

    public void  removefoodlist(String item){
       int postion = findItem(item);
       if(postion >= 0){
           removefoodlist(postion);
       }
    }

    private void  removefoodlist(int postion){

        foodList.remove(postion);
    }

    private int findItem (String searchitem){

        return foodList.indexOf(searchitem);
    }
    public  boolean onFile(String searchItem){

        int postion = findItem(searchItem);

        if (postion >=0)
        {
            return true;
        }

        return false;

    }
}
