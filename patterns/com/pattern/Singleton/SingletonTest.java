package com.pattern.Singleton;

import com.pattern.patterns.singleton.*;
import org.junit.Test;

public class SingletonTest {

    private SingletonMaker singletonMaker = new SingletonMaker();

    @Test
    public EagerInitialization getEagerSingleton() {
        return singletonMaker.getEagerSingleton()
                .orElseThrow(NullPointerException::new);
    }

    @Test
    public LazyInitialization getLazySingleton() {
        return singletonMaker.getLazySingleton()
                .orElseThrow(NullPointerException::new);
    }

    @Test
    public ThreadSafeInitialization getThreadsSafeSingleton() {
        return singletonMaker.getThreadSafeSingleton()
                .orElseThrow(NullPointerException::new);
    }

    @Test
    public InitializationOnDemandHolderIdiom getOnDemandHolderSingleton() {
        return singletonMaker.getOnDemandHolderSingletone()
                .orElseThrow(NullPointerException::new);
    }

    @Test
    public EnumInitialization getEnumSingleton() {
        return singletonMaker.getEnumSingleton();
    }


}
