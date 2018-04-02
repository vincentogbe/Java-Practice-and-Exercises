package com.vincent;

public class Car {

    private  int doors;
    private  int wheels;
    private  String model;
    private String engine;
    private  String colour;

    public void setDoors(int doors){

        this.doors = doors;

    }

    public int getDoors() {
        return this.doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setModel(String model) {

        String valiModel = model.toLowerCase();
        if(valiModel.equals("porsche")|| valiModel.equals("holden")){
            this.model = model;
        }
        else
        {
            this. model = "unknown";
         }

    }

    public String getModel() {
        return this.model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
}

