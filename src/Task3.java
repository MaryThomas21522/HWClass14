public class Task3 {
    boolean number(int num) {

        boolean isPrime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {

        Task3 prime = new Task3();

        int num = 5;

        boolean print = prime.number(num);
        System.out.println(print);

    }
}

/*
Write a method to return whether given number is prime or not?
 */
