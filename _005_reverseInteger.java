class Solution {
    public int reverse(int x) {
        long num = 0;
        int y = Math.abs(x);
        while (y > 0) {
            int rem = y % 10;
            num = num * 10 + rem;
            y = y / 10;
        }
        if (Integer.MAX_VALUE < num)
            return 0;
        if (x < 0)
            return -1 * (int) num;
        else
            return (int) num;
    }
}