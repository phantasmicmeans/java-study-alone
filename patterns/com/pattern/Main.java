package com.pattern;

import com.pattern.Singleton.SingletonTest;
import com.pattern.patterns.singleton.*;

public class Main {

    public static void main(String[] args) {
        // write your code her

        staticDeploy();

        SingletonTest st = new SingletonTest();
        st.getEagerSingleton().alive();
        ;
        st.getLazySingleton().alive();
        st.getOnDemandHolderSingleton().alive();
        st.getThreadsSafeSingleton().alive();
        st.getEnumSingleton().alive();

    }

    static void staticDeploy() {
        EagerInitialization.getSingleList();
        EnumInitialization.getInstance();
        InitializationOnDemandHolderIdiom.getInstance();
        LazyInitialization.getInstance();
        ThreadSafeInitialization.getInstacne();
    }
}
