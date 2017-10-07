import java.util.Scanner;

public class printSpiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        int n = 9;

        for (int i = 0; i < n; i++) { //increment line
            for (int j = 0; j < n; j++) { // increment spaces
                if (j > i)
                    System.out.print(n - i); // prints succeeding digits
                else
                    System.out.print(n - j);
            }

            for (int j = n - 2; j >= 0; j--) { // increment spaces
                if (j < i) //
                    System.out.print(n - j); // prints succeeding digits
                else
                    System.out.print(n - i);
            }

            System.out.println();

        }
        // 2nd half
        for (int i = n - 2; i + 1 > 0; i--) { //increment line
            for (int j = 0; j < n; j++) { // increment spaces
                if (j > i)
                    System.out.print(n - i); // prints succeeding digits
                else
                    System.out.print(n - j);
            }

            for (int j = n - 2; j >= 0; j--) { // increment spaces
                if (j < i) //
                    System.out.print(n - j); // prints succeeding digits
                else
                    System.out.print(n - i);
            }
            System.out.println();

        }


    }
}
