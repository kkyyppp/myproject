package com.csl.Report;

public class FinanceReport implements Report{
    @Override
    public void load() {
        System.out.println("Finance Report Loading");
    }

    @Override
    public void print() {
        System.out.println("Finance Report Printing");
    }
}
