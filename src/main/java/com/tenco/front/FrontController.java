package com.tenco.front;

public class FrontController {

    // 지배인은 누가 어떤 일을 잘하는지 이미 다 알고 잇습니다
    private void dispatcherRequest(String request) {
        if (request.equalsIgnoreCase("ORDERS")) {
            new OderWaiter().doWork();
        } else if (request.equalsIgnoreCase("PAYMENT")) {
            new PaymentWaiter().doWork();
        } else if (request.equalsIgnoreCase("RESERVE")) {
             new ReserveWaiter().doWork();
        } else {
            System.out.println("지베인 : 그런 서비스는 제공안해");
        }
    }


    // 외부 모든 요청이 들어오는 공통 입구 만들어줌
    public void handleRequest(String request) {
        // 1. 공통 처리를 (보안,로그 기록 등)
        System.out.println("[공통 처리] : 모든 요청은 일단 지배인에게 온다");
        // 2. 분석후 알맞은 담당자에게 배정한다
        dispatcherRequest(request);

    }
}
