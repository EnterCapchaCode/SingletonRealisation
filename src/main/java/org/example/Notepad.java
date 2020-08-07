package org.example;

public class Notepad {
    private static Notepad notepad;
    private static String information = "Your entries: \n";

    public static Notepad getNotepad(){
        if(notepad == null){
            notepad = new Notepad();
        }
        return notepad;
    }

    private Notepad(){

    }

    public void addEntries(String entry){
        information += entry + "\n";
    }

    public void showInfo(){
        System.out.println(information);
    }
}
