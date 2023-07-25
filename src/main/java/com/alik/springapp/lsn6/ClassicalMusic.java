package com.alik.springapp.lsn6;

public class ClassicalMusic implements Music {
    private static int counter;
    private ClassicalMusic(){
    }

    public static ClassicalMusic getClassicalMusicWithFactoryMethod(){
        System.out.println("Created new object with factory method");
        counter++;
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization " + counter);
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    public String getSong() {
        return "Rapsody";
    }

}
