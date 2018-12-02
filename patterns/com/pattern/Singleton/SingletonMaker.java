package com.pattern.Singleton;

import com.pattern.patterns.singleton.*;

import java.util.Optional;

public class SingletonMaker implements SingletonInterface{

    @Override
    public Optional<EagerInitialization> getEagerSingleton() {
        System.out.println(EagerInitialization.getSingleList().toString());
        return Optional.ofNullable(EagerInitialization.getSingleList());
    }

    @Override
    public Optional<LazyInitialization> getLazySingleton() {
        return Optional.ofNullable(LazyInitialization.getInstance());
    }

    @Override
    public Optional<ThreadSafeInitialization> getThreadSafeSingleton() {
        return Optional.ofNullable(ThreadSafeInitialization.getInstacne());
    }

    @Override
    public Optional<InitializationOnDemandHolderIdiom> getOnDemandHolderSingletone() {
        return Optional.ofNullable(InitializationOnDemandHolderIdiom.getInstance());
    }

    @Override
    public EnumInitialization getEnumSingleton() {
        return EnumInitialization.INSTANCE;
    }
}
