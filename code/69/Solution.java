class Solution {
    public int mySqrt(int x) {
        int high = x;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            double result1 = 1.0d * mid * mid;
            double result2 = 1.0 * (mid + 1) * (mid + 1);

            if (x * 1.0d == result1) {
                return mid;
            }
            if (result1<(x*1.0d) && (x*1.0d)<result2) {
                return mid;
            }
            if (result1 > x) {
                high = mid - 1;
            }
            if (result1 < x) {
                low = mid + 1;
            }
        }

        return -1;
    }
}