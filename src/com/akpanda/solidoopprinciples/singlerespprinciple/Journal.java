package com.akpanda.solidoopprinciples.singlerespprinciple;




import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> thoughts = new ArrayList<>();
    private static int count =0;

    public void addEntry(String thought){
        thoughts.add(""+(++count)+". "+thought);
    }


    public String toString(){
        return String.join(System.lineSeparator(),thoughts);
    }
}
