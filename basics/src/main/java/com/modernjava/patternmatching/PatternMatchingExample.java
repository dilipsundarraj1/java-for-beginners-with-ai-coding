package com.modernjava.patternmatching;

public class PatternMatchingExample {


    static void main(String[] args) {

        PatternMatchingExample patternMatchingExample = new PatternMatchingExample();
        patternMatchingExample.pattern(1);
        patternMatchingExample.pattern("Hello");
    }


    public String pattern(Object o) {
        if (o instanceof Integer) {
            var i = (Integer) o; // redundant cast to create binding variable
            return "Integer:" + i;
        }
        if (o instanceof String) {
            var i = (String) o;
            return "String of length:" + i.length();
        }
        return "Not a String or Integer";

    }

}
