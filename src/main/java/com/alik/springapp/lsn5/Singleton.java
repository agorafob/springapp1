package com.alik.springapp.lsn5;

public class Singleton {
    public static volatile Singleton instance;
    String name;

    private Singleton(String name){
        this.name=name;
    }

    public static Singleton getInstance(String name){
        Singleton objForUser = instance;
        if(objForUser==null){
            synchronized (Singleton.class){
                objForUser= instance;
                if (objForUser==null){
                    objForUser= instance =new Singleton(name);
                }
            }
        }
        return objForUser;
    }

    public String getName() {
        return name;
    }
}
