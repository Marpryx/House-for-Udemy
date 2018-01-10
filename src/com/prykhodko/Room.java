/////////////////////////////////////////////////////////////////
// The class was created to demonstrate has - a                //
// relationships between Room class and Light, Furniture,     //
// Floor and Window.                                          //
////////////////////////////////////////////////////////////////

package com.prykhodko;

public class Room {

    private String name;
    private Window window;
    private Floor floor;
    private Furniture furniture;
    private Light light;

    public Room(String name, Window window, Floor floor, Furniture furniture, Light light) {
        this.name = name;
        this.window = window;
        this.floor = floor;
        this.furniture = furniture;
        this.light = light;
    }

    /**
     * Getters for the Room class fields
     * @return
     */
    public String getName() {
        return name;
    }

    public Window getWindow() {
        return window;
    }

    public Floor getFloor() {
        return floor;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Light getLight() {
        return light;
    }

    /**
     * Moves the furniture
     */
    public void moveFurniture(){
        System.out.println("Room class --> Move the furniture");
        furniture.move();
    }
}
