package chap1_2.algorithm;

public class Algorithm04 {
    public static void main(String[] args) {
        long t = 0L;
        int c = 0;
        String str = "hello goodbye 2025120512061207 10 30000000000 -3333";
        String[] sArr = str.split("\\s+");

        for(int i = 0; i < sArr.length; i++) {
            try {
                Long v = Long.parseLong(sArr[i]);
                if(v >= Integer.MIN_VALUE && v <= Integer.MAX_VALUE) {
                    t += v;
                } else {
                    c++;
                }

            } catch (NumberFormatException e) {

            }
        }

        System.out.println("c = " + c);
        System.out.println("t = " + t);
    }
}
