package com.akpanda.solidoopprinciples.interfacesegregationprinciple.unsegregated;

import com.akpanda.solidoopprinciples.interfacesegregationprinciple.unsegregated.printerinterface.Printer;

public class PrinterImplemented implements Printer {
    @Override
    public void print() {
        //Valid
    }

    @Override
    public void scan() {
        //Dont know what to do
    }

    @Override
    public void copy() {
        //Dont know what to do
    }
}
