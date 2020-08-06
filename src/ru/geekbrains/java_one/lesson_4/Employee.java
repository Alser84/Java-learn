package ru.geekbrains.java_one.lesson_4;

public class Employee {
    private String fullName;
    private double salary;
    private int age;
    private int id;
    private static int tID=0;

    //Задание 8, добавил id
    public Employee(String fullName, double salary, int age){
        tID++;
        this.fullName = fullName;
        this.salary = salary;
        this.age = age;
        this.id = tID;
    }

    public int getId() {
        return id;
    }

    public String getFullName(){
        return fullName;
    }

    public double getSalary(){
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
