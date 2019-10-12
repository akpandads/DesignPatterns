package com.akpanda.structural.decorartor;

public class Runner {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setAge(12);
        System.out.println(dragon.crawl() + dragon.fly());
    }


}
