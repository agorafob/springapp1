package com.alik.springapp.lsn5;

public class TestSingle {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("Alik");
        Singleton second = Singleton.getInstance("Val");
        System.out.println(first.getName());
        System.out.println(second.getName());
    }

}
