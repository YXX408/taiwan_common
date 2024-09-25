package com.taiwan.utils;

public class Ascii {
    //ASCII转变为字符串
    private String backASCII(String clientData){
        String[] asciiArray = clientData.split(" ");
        StringBuilder chineseBuilder = new StringBuilder();

        for (String asciiChar : asciiArray) {
            int asciiValue;
            try {
                asciiValue = Integer.parseInt(asciiChar);  // 将 ASCII 转换为整数
            } catch (NumberFormatException e) {
                // 处理非数字的情况，可以根据需求进行适当处理
                chineseBuilder.append(asciiChar);  // 非数字字符，保留原样
                continue;
            }
            if (asciiValue >= 0 && asciiValue <= 127) {
                // 英文字符范围，保留原样
                chineseBuilder.append(asciiChar);
            } else {
                // 非英文字符范围，将 ASCII 转换为对应的中文字符
                char chineseChar = (char) asciiValue;
                chineseBuilder.append(chineseChar);
            }
        }
        return chineseBuilder.toString();
    }
    //字符串转变为ASCII
    private String charASCII(String responseData){

        StringBuilder asciiBuilder = new StringBuilder();

        for (int i = 0; i < responseData.length(); i++) {
            char c = responseData.charAt(i);
            int asciiValue = (int) c;
            asciiBuilder.append(asciiValue).append(" ");
        }
        return asciiBuilder.toString().trim();
    }
}
