package com.gupao.singletonpattern;

/**
 * The best singleTon implementation, thread safe, robust, high performance
 */
public class SingleTon5 {

    private SingleTon5(){}

    private static class LazyHolder{
        private static final SingleTon5 INSTANCE = new SingleTon5();
    }

    public static SingleTon5 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
