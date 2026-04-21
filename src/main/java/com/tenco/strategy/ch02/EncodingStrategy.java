package com.tenco.strategy.ch02;

// 전략 패턴 규칙 선언: 모든 인코딩 전략은 encode 기능을 구현해야 한다.
public interface EncodingStrategy {
    String encode(String text);
}
