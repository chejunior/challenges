package class02.arrays.cyclicrotation;


public class SolutionCyclicRotation {
    
    public int[] solution(int[] A, int K) {
        if (A.length>0) {
            for (int i = 0; i < K; i++) {
                int arraySize = A.length-1;
                int lastPosition = A[arraySize];
                for (int j = arraySize; j >0; j--) {
                    A[j]=A[j-1];
                }
                A[0]=lastPosition;
            }
        }
        return A;
    }

}
