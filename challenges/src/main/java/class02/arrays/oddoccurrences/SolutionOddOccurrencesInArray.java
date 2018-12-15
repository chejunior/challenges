package class02.arrays.oddoccurrences;


public class SolutionOddOccurrencesInArray {

    public int solution(int[] A) {
        int elem = 0;

        for (int i = 0; i < A.length; i++) {
            elem ^= A[i];
        }
        return elem;
    }

}
