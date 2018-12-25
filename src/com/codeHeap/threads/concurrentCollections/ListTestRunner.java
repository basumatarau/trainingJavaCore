package com.codeHeap.threads.concurrentCollections;

public class ListTestRunner {
    public static void main(String[] args) {

        //Tester.initMain(args);

        new SynchronizedArrayListTest(10, 0);
        new SynchronizedArrayListTest(9, 1);
        new SynchronizedArrayListTest(5, 5);
        new CopyOnWriteArrayListTest(10, 0);
        new CopyOnWriteArrayListTest(9, 1);
        new CopyOnWriteArrayListTest(5, 5);
    }
}
