package com.company;

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows with while:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int nsp=rows-1;
        int nst=1;
        int row=0;
        while(row<rows) {
            int csp=0;
            while (csp < nsp) {
                System.out.print(" "+" ");
                csp++;
            }
            int cst=0;
            while (cst < nst) {
                System.out.print(row+1+" ");
                cst++;
            }

            System.out.println();
            nst=nst+2;
            nsp--;
            row++;
        }
    }
}
