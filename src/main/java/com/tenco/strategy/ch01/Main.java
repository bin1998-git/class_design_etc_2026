package com.tenco.strategy.ch01;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {

    }
}

// 인코딩을 담당해주는 클래스
class Encoder {

    // base64 인코딩 방법(바이트 데이터를 ---> 특정형태의 문자열로 인코딩)
    // 파일을 전송할 떄 01010 바이너리 데이터로 보내게 된다.
    // 클라이언트 --- 서버측으로 파일을 전송하려고 함
    // 하지만 서버에서는 바이너리 형태를 받게 설계 되어있지 않음.
    // 즉 json형식으로 던져야함
    // json 문자열 (0101 x) --> 인코딩 --

    // text --> "안녕 반가워"
    public String encode(String text, String format) {
        if ("base64".equalsIgnoreCase(format)) {
            return java.util.Base64.getEncoder()
                    .encodeToString(text.getBytes());
        } else if ("append".equalsIgnoreCase(format)) {
            return "ABC[" + text + "]";
        } else if ("url".equalsIgnoreCase(format)) {
            // 브라우저에 한글이나 특수문자를 %2F 같은 형태로 변환
            try {
                return java.net.URLEncoder.encode(text,"UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }


}