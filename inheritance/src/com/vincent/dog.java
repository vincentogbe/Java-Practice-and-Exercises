package com.vincent;

public class dog extends animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();

    }

    private void chew(){
        System.out.println("dog.chew() called");
    }
    public void walk(){
        System.out.println("dog.walk() called");
        move(5);
    }
    private void movelegs(int speed){
        System.out.println("dog.moveleg() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called");
        movelegs(speed);
        super.move(speed);
    }

    public void run(){
        System.out.println("dog.run() called");
        move(10);
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

}
