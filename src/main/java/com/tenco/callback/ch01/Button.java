package com.tenco.callback.ch01;

// 버튼 클래스 설계
public class Button {

    String name; // 버튼 이름
    // 버튼에 연결된 리스너(콜백 메서드)
    IButtonListener iButtonListener;

    public Button (String name) {
        this.name = name;
    }


    // 외부에서 인터페이스 타입을(구현) 클래스를 인수로 넣어 줄 수 있다.
    // 콜백 메서드를 설정하는 메서드
    public void addListener(IButtonListener iButtonListener) {
        this.iButtonListener = iButtonListener;
    }

    // 버튼이 클릭 되었을떄 메서드 호출(콜백 메서드 호출)
    public void click(String message) {
        iButtonListener.clickEvent(message);
        //System.out.println("배터리가 없어 엄마에게 호출 못함");
    }

}
