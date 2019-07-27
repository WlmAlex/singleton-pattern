package com.gupao.singletonpattern;

import java.util.Objects;

/**Double checking lock
 * thread safe, high performance, maybe don't work
 */
public class SingleTon3 {

    private static SingleTon3 singleTon3;

    private SingleTon3(){}

    public static SingleTon3 getInstance() {
        if (Objects.isNull(singleTon3)) {
            synchronized (SingleTon3.class) {
                if (Objects.isNull(singleTon3)) {
                    singleTon3 = new SingleTon3();
                }
            }
        }
        return singleTon3;
    }
}
