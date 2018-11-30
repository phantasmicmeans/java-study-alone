package com.pattern.patterns.singleton;

public class LazyInitialization{
    //Lazy Installation class instance가 사용되는 시점에 인스턴스를 만드는 싱글톤 패턴
    //thread-safe 하지 않다. 동일 시점에 getInstance() method를 호출하면 인스턴스가 두번 생길 위험.
    private static LazyInitialization instance;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        if (instance == null) //이미 객체화 되어있으면 그냥 넘어가
            instance = new LazyInitialization();
        return instance;
    }

    public void alive(){
        System.out.println("hello Lazy");
    }
}
