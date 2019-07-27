package com.gupao.singletonpattern;

import java.util.Objects;

/**
 * thread unsafe
 */
public class Singleton1 {

    private Singleton1(){}

    private static Singleton1 singleton1;

    public static Singleton1 getInstance() {
        if (Objects.isNull(singleton1)) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
