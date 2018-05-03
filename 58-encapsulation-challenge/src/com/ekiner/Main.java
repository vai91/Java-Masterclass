package com.ekiner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer hp656c = new Printer(100,false);
        Printer hpK110 = new Printer(80,true);

        hpK110.fillToner();
        hpK110.printPages(3);
        hpK110.getPagesPrinted();

    }
}
