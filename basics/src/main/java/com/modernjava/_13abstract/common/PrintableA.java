package com.modernjava._13abstract.common;

public interface PrintableA {
    default void info() { System.out.println("PrintableA info"); }
}

