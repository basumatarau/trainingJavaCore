package com.codeHeap.generics.reflectionFactory.factoryConstraint;

public class IntegerFactory implements IFacotory<Integer> {
    @Override
    public Integer create(Object... args) {
        //autoboxing...
        int result=0;
        for (Object arg : args) {
            result+=Integer.valueOf(arg.toString());
        }
        return result;
    }
}
