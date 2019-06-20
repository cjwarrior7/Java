package com.company;

import java.util.Scanner;

public class Pattern17forloop {


    public static void main(String[] args) {
        System.out.print("Enter the number of rows with for:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int nst=rows/2;
        int nsp=1;

        for (int i = 0; i <rows ;i++) {
            for (int cst = 0; cst < nst ; cst++) {
                System.out.print("*"+" ");

            }
            for (int csp = 0; csp < nsp ; csp++) {
                System.out.print(" "+" ");

            }
            for (int cst = 0; cst < nst ; cst++) {
                System.out.print("*"+" ");

            }
            System.out.println();
            if(i<rows/2)
            {
                nst=nst-1;
                nsp=nsp+2;

            }


            else
            {
                nst=nst+1;
                nsp=nsp-2;


            }


        }






    }
}
