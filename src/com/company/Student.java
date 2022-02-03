package com.company;

public class Student {
    private String studentName;
    private int clas;
    private int age;
    private int group;

    public void study(){
        System.out.println("study at  Peaksoft");
    }public void play(){
        System.out.println( "playing");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
