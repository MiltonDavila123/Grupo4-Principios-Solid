package org.example.LSP;

public class Dog extends Animal implements Walks{
    @Override
    public void makeSound() {
        System.out.println("WOAF WOAF WOAF");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks");
    }
}
