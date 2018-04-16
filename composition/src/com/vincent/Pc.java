package com.vincent;

public class Pc {
    private Case theCase;
    private  Monitor monitor;
    private  Motherboard motherboard;

    public Pc(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
     //fancy graphics
     monitor.drawPixelAt(1220,50,"yellow");
    }

}
