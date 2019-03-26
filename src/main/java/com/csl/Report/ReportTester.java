package com.csl.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report report1 = new FinanceReport();
        Report report2 = new HealthReport();

        List<Report> reportList = new ArrayList<>();
        reportList.add(report1);
        reportList.add(report2);

        for(Report r: reportList) {
            r.load();
            r.print();
        }
    }
}
