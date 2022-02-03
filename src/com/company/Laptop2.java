package com.company;

import java.time.LocalDate;
import java.util.Locale;

public class Laptop2 {
   private String laptopName;
    private int memory;
     String color;
     String CPU;
    public  void on(){
        System.out.println("Turn on");
    }public void off() {
        System.out.println("Turn off");
    }
    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    }


