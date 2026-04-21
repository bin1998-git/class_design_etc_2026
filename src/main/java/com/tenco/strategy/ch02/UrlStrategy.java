package com.tenco.strategy.ch02;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        try {
            return URLEncoder.encode(text,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
