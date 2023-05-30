class CheckPrime {
    public static void main(String[] args) {
        int n = 7, rem = 0, sum = 0, c = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

}
