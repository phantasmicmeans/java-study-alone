package com.pattern.patterns.singleton;

public class ThreadSafeInitialization {
    //Thread safe initialization, 위는 multi-thread 문제를 해결 할 수 없다.
    //synchronized(동기화)를 사용하여 singleton pattern을 구현한다.
    //여러 thread 들이 동시에 접근해서 인스턴스를 생서시키는 위험은 없다.
    // 하지만 수 많은 thread들이 getInstance() method를 호출하게 되면 높은 cost 비용..
    private static ThreadSafeInitialization instance;

    private ThreadSafeInitialization() {
    }

    public static synchronized ThreadSafeInitialization getInstacne() {
        if (instance == null)
            return new ThreadSafeInitialization();
        return instance;
    }
    public void alive(){
        System.out.println("hello Thread");
    }
}
