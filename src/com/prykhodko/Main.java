/**
 * Main class to test the work of the Room, Light, Furniture, Floor and Window classes
 */

package com.prykhodko;

public class Main {

    public static void main(String[] args) {

    Window window = new Window(4, true);
    Furniture furniture = new Furniture("sofa", "white", "corner", "big");
    Floor floor = new Floor("parquet", "brown", 358, 675);
    Light light = new Light("Wall mounted", true, 3);

    Room myRoom = new Room("Living Room", window, floor, furniture, light);
    myRoom.moveFurniture();

    myRoom.getLight().turnOnTheLight();

    }
}
