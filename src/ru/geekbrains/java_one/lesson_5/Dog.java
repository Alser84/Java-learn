package ru.geekbrains.java_one.lesson_5;

public class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int length) {
        if (length > 500){
            System.out.println(this.name + " не может пробежать дальше");
        } else System.out.println(this.name + " пробежал");
    }

    @Override
    public void swim(int length) {
        if (length > 10){
            System.out.println(this.name + " дальше не поплывёт");
        } else System.out.println(this.name + " проплыл(а)");
    }

    @Override
    public void jump(int height) {
        if (height > 0.5){
            System.out.println(this.name + " выше не прыгнет");
        } else System.out.println(this.name + " прыгнула");
    }
}
