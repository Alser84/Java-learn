package ru.geekbrains.java_one.lesson_5;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik",5);
        Dog dog1 = new Dog("Spike",6);
        Taksa taksa1 = new Taksa("Buch",8);
        Greyhound greyhound1 = new Greyhound("Fasty", 5);

        Animal[] animals = {cat1,dog1,taksa1,greyhound1};
        for (int i = 0; i < animals.length; i++) {
            animals[i].jump(1);
            animals[i].run(250);
            animals[i].swim(8);
            if (animals[i] instanceof Dog){
                animals[i].run(450);
                animals[i].run(650);

            }
        }
    }
}
