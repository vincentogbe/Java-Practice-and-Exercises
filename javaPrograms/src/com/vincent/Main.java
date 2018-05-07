package com.vincent;

import java.util.ArrayList;

class intClass{

    private int myValue;

    public intClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] strarray = new String[10];
        int [] intArrat = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("vincent");

        //ArrayList<int> intArraylist = new ArrayList<int>();
        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));
        Integer integer = new Integer(54);
        Double dounleValue = new Double(12.12);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i= 0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i= 0; i<=10; i++){

            System.out.println(i + " -> " + intArrayList.get(i).intValue());

        }

        Integer myintValue = 54;
        int myint = myintValue;

        ArrayList<Double> myDouble = new ArrayList<Double>();

        for (Double dbl= 0.0; dbl<= 10.0; dbl+= 0.5){

            myDouble.add(Double.valueOf(dbl));
        }

        for (int i=1; i<myDouble.size(); i++){
            double value = myDouble.get(i).doubleValue();
            System.out.println(i + " - > " + value);
        }
    }
}
