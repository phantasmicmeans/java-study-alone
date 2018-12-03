package com.pattern.patterns.singleton;

public class EagerInitialization {

    private static EagerInitialization singleton = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getSingleList() {
        return singleton;
    }
    public void alive(){
        System.out.println("hello eager");
    }
}
