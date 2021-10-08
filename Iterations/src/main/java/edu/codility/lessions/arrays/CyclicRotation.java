package edu.codility.lessions.arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int[] arr = A;
        if (A.length > 0) {
            for (int i = 0; i < K; i++) {
                arr = shift(arr);
            }
        }

        return arr;

    }

    public int[] shift(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        if(len > 0) {
            B[0] = A[len - 1];
            for (int i = 1; i < len; i++) {
                B[i] = A[i - 1];
            }
        }
        return B;
    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();

        int[] A = new int[]{3, 8, 9, 7, 6};

        int[] B = cyclicRotation.solution(A, 5);
        //int[] B = cyclicRotation.shift(A);

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + ", ");
        }


    }
}
