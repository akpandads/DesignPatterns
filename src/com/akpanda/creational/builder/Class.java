package com.akpanda.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Class {
    String name;
    List<Field> fields = new ArrayList<>();

    public Class(){}

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String nl = System.lineSeparator();
        sb.append("public class " + name).append(nl)
                .append("{").append(nl);
        for (Field f : fields)
            sb.append("  " +  f).append(nl);
        sb.append("}").append(nl);
        return sb.toString();
    }
}
