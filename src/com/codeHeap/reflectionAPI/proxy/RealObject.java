package com.codeHeap.reflectionAPI.proxy;

public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething();");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("something else: " + arg);
    }
}
