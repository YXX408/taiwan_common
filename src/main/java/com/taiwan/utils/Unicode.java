package com.taiwan.utils;

import org.springframework.stereotype.Component;

@Component
public class Unicode {
    public static String decodeUnicode(String input) {
        StringBuilder builder = new StringBuilder();

        int index = 0;
        while (index < input.length()) {
            if (input.charAt(index) == '\\' && input.charAt(index + 1) == 'u') {
                String hexCode = input.substring(index + 2, index + 6);
                int charCode = Integer.parseInt(hexCode, 16);
                builder.append((char) charCode);
                index += 6;
            } else {
                builder.append(input.charAt(index));
                index++;
            }
        }

        return builder.toString();
    }
}
