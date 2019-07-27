package com.gupao.singletonpattern;

import java.util.Objects;

/** using key word: volatile
 * thread safe, robust, high performance
 */
public class SingleTon4 {

    private static volatile SingleTon4 singleTon4;

    private SingleTon4() {}

    public static SingleTon4 getInstance() {
        if (Objects.isNull(singleTon4)) {
            synchronized (SingleTon4.class) {
                if (Objects.isNull(singleTon4)) {
                    singleTon4 = new SingleTon4();
                }
            }
        }
        return singleTon4;
    }
}
