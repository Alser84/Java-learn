package ru.geekbrains.java_one.lesson_5;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int length) {
        if (length > 200){
            System.out.println(this.name + " не может пробежать дальше");
        } else System.out.println(this.name + " пробежал");
    }

    @Override
    public void swim(int length) {
        System.out.println(this.name + " не умеет плавать");
    }

    @Override
    public void jump(int height) {
        if (height > 2){
            System.out.println(this.name + " выше не прыгнет");
        } else System.out.println(this.name + " прыгнул");
    }
}
