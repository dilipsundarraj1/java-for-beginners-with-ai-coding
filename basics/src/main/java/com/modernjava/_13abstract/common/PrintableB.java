package com.modernjava._13abstract.common;

public interface PrintableB {
    default void info() { System.out.println("PrintableB info"); }
}