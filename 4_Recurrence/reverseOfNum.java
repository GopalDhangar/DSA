public class reverseOfNum {

    static int reverse(int n, int digits) {
        if (n % 10 == n)
            return n;
        return n % 10 * (int) (Math.pow(10, digits - 1)) + reverse(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        int n = 1234;
        int digits = (int) (Math.log10(n) + 1);
        System.out.println(reverse(n, digits));
    }
}