public class countZeroes {
    static int count(int n, int c) {
        if (n == 0)
            return c;
        if ((n % 10) == 0)
            return count(n / 10, c++);
        else
            return count(n / 10, c);
    }

    public static void main(String[] args) {
        System.out.println(count(30204, 0));
    }

}
