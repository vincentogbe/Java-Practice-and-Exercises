package com.vincent;

public class Main {

    public static void main(String[] args) {
	// write your code here

        animal animal1 = new animal("animal",1,1,5,5);

        dog dog1 = new dog ("billy", 1, 1,5,5,2,4,1,20,"brown");
        dog1.eat();
        dog1.walk();
        dog1.run();
    }
}
