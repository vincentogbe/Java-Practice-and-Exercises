package com.vincent;

public class SportsCar extends Car {

    private int roadServiceMonth;

    public SportsCar(int roadServiceMonth) {
        super("sportsCar", "4wd", 5, 3, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
    public void accelerate(int rate ){
        int newVelocity = getCurrentVelocity()+ rate;
        if (newVelocity ==0){
            stop();
            setCurrentGear(1);
        }
        else if(newVelocity >0 && newVelocity <=10){
            setCurrentGear(1);
        }
        else if(newVelocity >10 && newVelocity <=20){
            setCurrentGear(2);
        }
        else if(newVelocity >20 && newVelocity <=30){
            setCurrentGear(3);
        }
        else
        {
           setCurrentGear(4);
        }
        if (newVelocity >0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
