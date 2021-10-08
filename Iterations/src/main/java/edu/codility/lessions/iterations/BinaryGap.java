package edu.codility.lessions.iterations;

public class BinaryGap {

    public int solution(int N) {
        System.out.print("" + N + "(" + Integer.toBinaryString(N) + ") --> ");
        int max = 0;

        char[] chars = Integer.toBinaryString(N).toCharArray();
        int len = 0;
        for(char c: chars) {
            if(c == '0') {
                len ++;

            } else {
                if(len > max) {
                    max = len;
                }
                len = 0;
            }
        }
        System.out.println(max);

        return max;
    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();

        binaryGap.solution(9);
        binaryGap.solution(529);
        binaryGap.solution(15);
        binaryGap.solution(20);
        binaryGap.solution(1041);
        binaryGap.solution(32);
    }
}
