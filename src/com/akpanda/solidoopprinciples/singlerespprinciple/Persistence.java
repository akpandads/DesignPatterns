package com.akpanda.solidoopprinciples.singlerespprinciple;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {

    public void save(Journal journal, String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)){
            out.println(journal.toString());
        }
    }
}

