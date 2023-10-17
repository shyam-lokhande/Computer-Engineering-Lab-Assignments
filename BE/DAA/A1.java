import java.util.*;

public class A1 {
    public static void main(String[] args) {
        int input, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose one of the following : 1.Recursive Fibonacci 2.Non-reccursive Fibonacci");
        input = sc.nextInt();
        System.out.println("Which fibonacci numbers do you need?");
        num = sc.nextInt();
        A1 a = new A1();
        sc.close();

        if (input == 1)
            System.out.println(a.fib(num));
        else if (input == 2)
            System.out.println(a.recFib(num));
        else
            System.out.println("You have entered a wrong choice!");
    }

    public int fib(int num) {
        int first = 0, second = 1;

        if (num == 1)
            return 0;
        else if (num == 2)
            return 1;
        else {
            // System.out.println(first+" "+second);

            for (int i = 3; i <= num; i++) {
                int temp = second;
                second += first;
                first = temp;
                // System.out.println(second);
            }
        }
        return second;
    }

    public int recFib(int num) {
        if (num == 1)
            return 0;
        if (num == 2)
            return 1;

        return recFib(num - 1) + recFib(num - 2);
    }
}