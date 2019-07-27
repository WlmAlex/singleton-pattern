package com.gupao.singletonpattern;

import java.util.Objects;

/**
 * thread safe, but cost expensive
 */
public class SingleTon2 {

    private static SingleTon2 singleton2;

    private SingleTon2(){}

    public static synchronized SingleTon2 getInstance() {
        if (Objects.isNull(singleton2)) {
            singleton2 = new SingleTon2();
        }
        return singleton2;
    }
}
