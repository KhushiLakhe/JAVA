import java.util.*;

public class  hackwithinfimock
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Sliding window with hashmap to track frequency
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, maxSum = 0, currSum = 0;

        for (int right = 0; right < n; right++) {
            int val = A[right];
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            currSum += val;

            while (freq.size() > k) {
                int leftVal = A[left];
                freq.put(leftVal, freq.get(leftVal) - 1);
                if (freq.get(leftVal) == 0) {
                    freq.remove(leftVal);
                }
                currSum -= leftVal;
                left++;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }
}