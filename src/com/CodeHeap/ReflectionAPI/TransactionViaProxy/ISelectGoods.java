package com.CodeHeap.ReflectionAPI.TransactionViaProxy;

public interface ISelectGoods {
    int askForGood(int goodId);

    void getGood(int goodId);

    void putGoodToBasket(int goodId);
}