package com.company;

public class Main {

    public static void main(String[] args) {
	Laptop2 laptop = new Laptop2();
        laptop.setLaptopName("MacOs");
        laptop.setMemory(8);
        laptop.setCPU("Intel Core i7");
        System.out.println(laptop.getLaptopName());
        System.out.println(laptop.getMemory());
        System.out.println(laptop.getCPU());
        laptop.on();
        laptop.off();

        System.out.println("       ");
        Student student = new Student();
        student.setStudentName("Bekzhan");
        student.setAge(19);
        student.setGroup(5);
        System.out.println(student.getStudentName() );
        System.out.println(student.getAge());
        System.out.println(student.getGroup());
        student.study();
        student.play();
    }
}
