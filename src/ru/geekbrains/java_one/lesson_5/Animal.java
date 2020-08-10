package ru.geekbrains.java_one.lesson_5;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;

    }

    public abstract void run(int length);

    public abstract void swim(int length);

    public abstract void jump(int height);


}
