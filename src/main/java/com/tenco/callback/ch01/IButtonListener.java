package com.tenco.callback.ch01;

// 버튼이 눌러졌을 떄 클릭한 동작을 명시하는 인터페이스를 정의(콜백 메서드 정의)
interface IButtonListener {
    void clickEvent(String event);
    // void clickDbEvent(String event);
}
