package com.codeHeap.generics.covariance.playingAroundV2;

public class Holder<T> {
    private T instance;
    public Holder(T instance){
        this.instance = instance;
    }

    public void setInstance(T instance) {
        this.instance = instance;
    }

    public T getInstance(){
        return instance;
    }
}
