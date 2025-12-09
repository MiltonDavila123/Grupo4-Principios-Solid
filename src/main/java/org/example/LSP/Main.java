package org.example.LSP;

public class Main {
    public static void main(String[] args) {
        Dog dog =  new Dog();
        Fish fish = new Fish();

        dog.makeSound();
        ((Walks) dog).walk();

        fish.makeSound();
    }
}
