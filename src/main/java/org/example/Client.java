package org.example;

public class Client {
    public static void main(String[] args) {
        Notepad.getNotepad().addEntries("Encapsulation");
        Notepad.getNotepad().addEntries("Abstraction");
        Notepad.getNotepad().addEntries("Inheritance");
        Notepad.getNotepad().addEntries("Polymorphism");

        Notepad.getNotepad().showInfo();
    }
}
