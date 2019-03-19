package com.csl.student;

public class GraduateStudent extends Student {
    private int thesis;
    static int pass= 70;
    public GraduateStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis =thesis;
    }

    public GraduateStudent(String id, String name, int english, int math, int thesis) {
        super(id, name, english, math);
        this.thesis =thesis;
    }

    @Override
    public void print() {
        System.out.print("name: "+ name+ "\tenglish: "+ english+ "\tmath: "+ math + "\tthesis: "+thesis+
                "\taverage: "+ getAvg());

        if (getAvg() > pass) {
            System.out.println("\tPASS");
        }
        else {
            System.out.println("\tFAILED");
        }


        int avg = getAvg();
        char level = getGrade(avg);
        System.out.println("LEVEL: "+ level);
    }

}
