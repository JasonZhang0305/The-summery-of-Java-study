package com.PolyMorphic.ObjectPoly;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry();
        animal = new Cat();
        animal.cry();
    }
}
