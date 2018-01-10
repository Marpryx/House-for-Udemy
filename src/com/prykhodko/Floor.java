/////////////////////////////////////////////////////////////////
// The Floor class was created to demonstrate                 //
// a composition in Java                                      //
////////////////////////////////////////////////////////////////

package com.prykhodko;

public class Floor {

    private String type;
    private String colour;
    private int length;
    private int width;

    public Floor(String type, String colour, int length, int width) {
        this.type = type;
        this.colour = colour;
        this.length = length;
        this.width = width;
    }

    /**
     * Getters for the Floor class
     * @return
     */
    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
