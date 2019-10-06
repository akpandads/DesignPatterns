package com.akpanda.solidoopprinciples.singlerespprinciple;

public class Runner {
    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();
        journal.addEntry("The meeting is at 9 AM");
        journal.addEntry("The meeting went well");
        System.out.println(journal.toString());

        Persistence persistence = new Persistence();
        String fileName="/home/kvothekelsier/IdeaProjects/DesignPatterns/src/com/akpanda/solidpr/singleresp/resources/output/journal.txt";
        persistence.save(journal,fileName);
    }
}
