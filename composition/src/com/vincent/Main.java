package com.vincent;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220b","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast","Acer ",27,new Resolution(2540,1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus" , 4,6,"v2.44");

        Pc thePc = new Pc(theCase,theMonitor,theMotherBoard);
        thePc.powerUp();

         /*
    create a single room of a house using composition
    think about the things that should be included in the room.
    maybe physical parts of the house but furniture as well
    add at lease one method to access an object via a getter and
    then that objects public methods as you saw in the previous video
    then add at lease one method to hide the objects.
    */
         Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bedRoom = new Bed("vincent's Bed ",4 ,3,2,1);

        Lamp lamp = new Lamp("classic", false, 75);

        BedRoom bedroom = new BedRoom("vincent",wall1,wall2,wall3,wall4,ceiling,bedRoom,lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();
        



    }
}
