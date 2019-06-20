package com.company;

import java.util.Scanner;

public class Pattern27 {

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
                    System.out.print(" "+"\t");
                    csp++;
                }
                int cst=0;
                int val=1;
                while (cst < nst) {
                    System.out.print(val + "\t");
                    // preperation for every column
                    cst++;
                    if (cst <= nst / 2) {
                        val++;

                    }
                    else {
                        val--;
                    }



                }


                System.out.println();
                nst=nst+2;
                nsp--;
                row++;
            }
        }
    }

