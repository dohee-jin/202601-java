package chap1_2;

public class DataType {
    public static void main(String[] args) {
        // 정적 타이핑 언어
        int a = 20;
        double b = 12.5;
        char c = 'A';
        String hello = "hello";
        boolean flag = true;

        // ==== 정수 타입 (byte: 1, short: 2, int: 4, long: 8) ==== //
        // 1byte == 8bit -> 10진수 정수 8 -> 2진수 0 000 1000
        // -128 ~ 127 까지 표현 가능 -> 255 가지 저장 가능
        byte x1 = 127;

        // 2byte == 16bit -> 10진수 정수 1000 -> 11 1110 1000
        // -32786 ~ 32767 까지 표현 가능
        short x2 = 32767;

        // 4byte == 32bit , 2의 32승 표현 가능
        int x3 = 2147483647;


        // ==== 실수 타입 (float: 4byte, double: 8byte) ==== //
        float f1 = 3.142592F;
        double d1 = 3.14159234224234;

        // ==== 논리 타입 ==== //
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;


    }
}
