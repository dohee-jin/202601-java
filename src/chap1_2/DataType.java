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

        // ==== 문자 타입 (char: 2byte, string) ==== //
        char c1 = 'A'; // 2byte
        // 컴퓨터에서 문자는 아스키코드(유니코드)로도 표현이 가능하여 변수에 정수를 넣어줘도 된다.
        char c2 = 97;
        char c3 = 51433; // 죩 이 출력됨

        // char 는 문자 두개를 변수에 저장할 수 없다.

        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(cArr);
        System.out.println("str = " + str);

        // "" 안에 넣으면 문자를 알아서 배열로 바꿔준다.
        // 아래 두 가지의 과정을 String str = ""; 한 줄로 만들 수 있다.
        // char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        // String str = new String(cArr);
        String str2 = "안녕하세요";

        // 자바 17부터 지원하는 문법
        // 원래는 "안녕하세요" + "ㅋㅋㅋ" 이렇게 써야 했다.
        String str3 = """
                안녕하세요 
                ㅋㅋㅋ
                """;

        // 자바 9부터 지원하는 문법
        // 동적 타이핑 지원, 자바에서는 권유하지 않음
        var z = 100;
        var k = "안녕";

    }
}
