package com.pattern.Singleton;


import com.pattern.patterns.singleton.*;

import java.util.Optional;

public interface SingletonInterface {

    Optional<EagerInitialization> getEagerSingleton();
    Optional<LazyInitialization> getLazySingleton();
    Optional<ThreadSafeInitialization> getThreadSafeSingleton();
    Optional<InitializationOnDemandHolderIdiom> getOnDemandHolderSingletone();
    EnumInitialization getEnumSingleton();

}
