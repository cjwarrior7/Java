package  com.company;
import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows with while:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int row = 0;
        int nst = 1;
        int nsp = rows / 2;
        while (row < rows) {

            int csp = 0;
            while (csp < nsp) {
                System.out.print(" " + " ");
                csp++;
            }

            int cst = 0;
            while (cst < nst) {
                System.out.print("*" + " ");
                cst++;
            }

            System.out.println();
            if (row < rows / 2) {
                nsp = nsp - 1;
                nst = nst + 2;

            } else {
                nsp = nsp + 1;
                nst = nst - 2;
            }
            row++;

        }
    }
}