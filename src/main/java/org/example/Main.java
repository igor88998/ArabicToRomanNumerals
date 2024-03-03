package org.example;

/*
    @author igormakovijcuk
    @project ArabicToRoman
    @class UtilTest
    @version 1.0.0
    @since 02.03.2024 - 13.11
*/

public class Main {
    public static void main(String[] args) {
        int number = 112457;
        String roman = Util.convertToRoman(number);
        System.out.println(number + " in Roman numerals: " + roman);
    }
}
