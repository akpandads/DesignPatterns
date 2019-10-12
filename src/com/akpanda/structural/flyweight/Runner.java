package com.akpanda.structural.flyweight;

public class Runner {
    public static void main(String[] args) {
        Sentence s = new Sentence("alpha beta gamma");
        s.getWord(1).capitalize = true;
        System.out.println(s);
    }
}
