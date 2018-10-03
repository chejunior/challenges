package class01.binary.gap;

public class Solution {

    public int solution(int N) {
        int result = 0;
        int biggerGap = 0;
        boolean firstOne = false;
        while (N > 0) {
            int mod = N % 2;
            if (mod==1) {
                firstOne = true;
                if (result>biggerGap) {
                    biggerGap = result;
                }
                result = 0;
            } else {
                if (firstOne) {
                    result ++;
                }
            }
            N /= 2;
        }
        return biggerGap;
    }

}
