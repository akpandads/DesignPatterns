package com.akpanda.solidoopprinciples.interfacesegregationprinciple.segregated;

import com.akpanda.solidoopprinciples.interfacesegregationprinciple.segregated.printerinterface.Copier;
import com.akpanda.solidoopprinciples.interfacesegregationprinciple.segregated.printerinterface.Printer;
import com.akpanda.solidoopprinciples.interfacesegregationprinciple.segregated.printerinterface.Scanner;

public class MultiFunctionalPrinter implements Scanner, Printer, Copier {
    @Override
    public void copy() {

    }

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }
}
