/////////////////////////////////////////////////////////////////
// The Light class was created to demonstrate                 //
// a composition in Java                                      //
////////////////////////////////////////////////////////////////

package com.prykhodko;

public class Light {

    private String type;
    private boolean isElectric;
    private int numberOfBulbs;

    public Light(String type, boolean isElectric, int numberOfBulbs) {
        this.type = type;
        this.isElectric = isElectric;
        this.numberOfBulbs = numberOfBulbs;
    }

    /**
     * Getters for the Light class
     * @return
     */
    public String getType() {
        return type;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public int getNumberOfBulbs() {
        return numberOfBulbs;
    }

    /**
     * To
     */
    public void turnOnTheLight(){
        System.out.println("Light class --> Turn on the light");
    }
}
