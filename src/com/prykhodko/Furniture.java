/////////////////////////////////////////////////////////////////
// The Furniture class was created to demonstrate              //
// a composition in Java                                      //
////////////////////////////////////////////////////////////////

package com.prykhodko;

public class Furniture {
    private String name;
    private String colour;
    private String type;
    private String size;

    public Furniture(String name, String colour, String type, String size) {
        this.name = name;
        this.colour = colour;
        this.type = type;
        this.size = size;
    }

    /**
     * Getters for the Furniture class
     * @return
     */
    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    /**
     * Moves the furniture
     */
    public void move(){
        System.out.println("Furniture class --> Move the furniture");
    }
}
