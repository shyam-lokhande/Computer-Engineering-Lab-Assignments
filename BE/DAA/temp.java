class temp {

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 4, 1, 2, 3 }));
    }

    public static int solution(int[] A) {
        int maxIncome = 0; // Initialize the maximum income to 0
        // int minPrice = Integer.MAX_VALUE; // Initialize the minimum price to a very
        // high value

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] - A[i + 1] > 0)
                maxIncome += A[i] - A[i + 1];
        }

        return maxIncome % 1_000_000_000; // Return the result modulo 1,000,000,000
    }
}
