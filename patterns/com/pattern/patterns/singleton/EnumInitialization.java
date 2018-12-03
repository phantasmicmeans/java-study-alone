package com.pattern.patterns.singleton;

public enum EnumInitialization {
    //effective java 책에서 등장한 enum singleton 방법
    INSTANCE;
    static String test = "";

    public static EnumInitialization getInstance() {
        test = "test";
        return INSTANCE;
    }
    //INSTANCE가 생성될 때 multi-thread 로 부커 안전하다.
    //단 한번의 인스턴스 생성을 보장한다.
    //사용이 간편하다.
    //enum value는 자바 프로그램 전역에서 접근이 가능하다.
    public void alive(){
        System.out.println("hello Enum");
    }
}
