package com.akpanda.solidoopprinciples.interfacesegregationprinciple.unsegregated;

import com.akpanda.solidoopprinciples.interfacesegregationprinciple.unsegregated.printerinterface.Printer;

public class MutiFunctionalPrinter implements Printer {
// All valid methods as all 3 methods are supported

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }

    @Override
    public void copy() {

    }
}
