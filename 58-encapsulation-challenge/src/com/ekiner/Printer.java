package com.ekiner;

public class Printer {
    // Create a class and demonstate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.

    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplex = false;

    public Printer (int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public void fillToner(){
        if(this.tonerLevel >100){
            System.out.println("something is wrong with your toner. Replace it.");
        }
        else if(this.tonerLevel >= 95){
            System.out.println("Toner doesnt need filling yet. Current: " + this.tonerLevel);
        } else {
            tonerLevel = 100;
            System.out.println("Toner filled to :" + this.tonerLevel);
        }

    }

    public int printPages(int i){
        if(this.duplex == true){
            pagesPrinted = 2*i;
            System.out.println(pagesPrinted);
            return pagesPrinted;
        }else{
            pagesPrinted = i;
            System.out.println(pagesPrinted);
            return pagesPrinted;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
