package pl.gawly;

public class Solution {

    public int solution(int[] A) {
        boolean[] count = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] < count.length) {
                count[A[i]-1] = true;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (!count[i]) {
                return i + 1;
            }
        }
        return A.length + 1;
    }
}
