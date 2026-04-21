package com.tenco.strategy.ch02;

public class Main {
    public static void main(String[] args) {
        // 클라이언트 입장에서 안녕 반가워를 인코딩해야 된다면
        // 어떤 전략을 사용할지 지정을 해 주면 된다.
        Encoder encoder = new Encoder();
        String message = "안녕반가워";

        // Base64 전략
        encoder.setEncodingStrategy(new Base64Strategy());
        System.out.println(encoder.getMessage(message));

        encoder.setEncodingStrategy(new AppendStrategy());
        System.out.println(encoder.getMessage(message));

        encoder.setEncodingStrategy(new UrlStrategy());
        System.out.println(encoder.getMessage(message));
    }
}
