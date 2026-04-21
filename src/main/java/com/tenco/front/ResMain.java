package com.tenco.front;

public class ResMain {
    public static void main(String[] args) {

//        OderWaiter oderWaiter = new OderWaiter();
//        PaymentWaiter paymentWaiter = new PaymentWaiter();
//            // 손님 1 입장 - 주문을 할려면 주문을 받는 웨이터 알고 있어야 함
//        System.out.println("----손님입장-----");
//
//        String request = "ORDER";
//        if (request.equals("ORDER")) {
//            oderWaiter.doWork();
//        } else if (request.equals("PAYMENT")) {
//            paymentWaiter.doWork();
//        }

        // 프론트 컨트롤러 패턴 적용 후
        FrontController frontController = new FrontController();

        // 손님 1 주문 받아라
        System.out.println("--손님 1 입장--");
        frontController.handleRequest("ORDER");

        // 손님2 여기 계산
        System.out.println("--손님 2 입장--");
        frontController.handleRequest("PAYMENT");

        System.out.println("--손님 3 입장--");
        frontController.handleRequest("TOILET");

        System.out.println("손님");
        frontController.handleRequest("RESERVE");
    }
}
