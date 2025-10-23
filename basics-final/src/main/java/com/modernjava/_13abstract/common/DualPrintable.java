package com.modernjava._13abstract.common;

public class DualPrintable implements PrintableA, PrintableB {
    //@Override
    public void info() {
        // Must resolve conflict explicitly
        System.out.println("print info");
        //info(); // leads to infinite recursion
        PrintableA.super.info(); // or PrintableB.super.info();
        //PrintableB.super.info();
        System.out.println("DualPrintable resolved the conflict.");
    }

    public static void main(String[] args) {
        DualPrintable dualPrintable = new DualPrintable();
        dualPrintable.info();
    }
}

