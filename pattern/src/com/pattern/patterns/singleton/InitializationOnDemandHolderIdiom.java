package com.pattern.patterns.singleton;

public class InitializationOnDemandHolderIdiom{
    //Initialization on demand holder idiom 기법.
    //jvm의 class loader의 매커니즘과 class의 load 시점을 이용하여 내부 class를 생성시킴으로
    //thread 간의 동기화 문제를 해결한다.
    private InitializationOnDemandHolderIdiom() {
    }

    private static class Singleton {
        private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
    }

    public static InitializationOnDemandHolderIdiom getInstance() {
        return Singleton.instance;
    }
    //현재 자바에서 싱글톤을 생성시킨다고 하면 거의 위의 방법.
    public void alive(){
        System.out.println("hello OnDemand");
    }
}
