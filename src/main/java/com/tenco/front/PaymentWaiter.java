package com.tenco.front;

public class PaymentWaiter  implements Water{
    @Override
    public void doWork() {
        System.out.println("결제를 합니다");
    }
}
