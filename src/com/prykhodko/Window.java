/////////////////////////////////////////////////////////////////
// The Window class was created to demonstrate                 //
// a composition in Java                                      //
////////////////////////////////////////////////////////////////


package com.prykhodko;

public class Window {

    private int numberOfWindows;
    private boolean hasCurtains;

    public Window(int numberOfWindows, boolean hasCurtains) {
        this.numberOfWindows = numberOfWindows;
        this.hasCurtains = hasCurtains;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public boolean isHasCurtains() {
        return hasCurtains;
    }

    public void closeTheWindow(){
        System.out.println("Window class --> Close the window");
    }

}
