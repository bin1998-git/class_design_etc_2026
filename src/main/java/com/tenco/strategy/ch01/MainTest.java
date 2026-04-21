package com.tenco.strategy.ch01;

public class MainTest {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        // base64 형태로 인코딩
        String base64Result = encoder.encode("안녕반가워", "base64");
        System.out.println(base64Result);

        // append 형태로 인코딩
        String appendResult = encoder.encode("안녕반가워","append");
        System.out.println(appendResult);


        // ulr 형태로 인코딩
        String urlResult = encoder.encode("안녕반가워","url");
        System.out.println(urlResult);
    }
}
