package com.tenco.front;

public class OderWaiter implements Water{
    @Override
    public void doWork() {
        System.out.println("웨이터: 주문을 주방으로 전달합니다");
    }
}
