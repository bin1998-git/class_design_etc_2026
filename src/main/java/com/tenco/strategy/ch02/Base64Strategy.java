package com.tenco.strategy.ch02;

import java.util.Base64;

// Base64 전략
public class Base64Strategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
