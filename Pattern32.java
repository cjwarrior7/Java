package com.company;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows with while:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int row=0;
        int nstn=1;
        int val=1;
        while(row<((2*rows)-1)){
            int cst=0;
            while(cst<nstn) {

                if (cst % 2 == 0) {
                    System.out.print(val+" ");


                } else {
                    System.out.print("*"+" ");

                }
                cst++;


            }
            //preparation
            System.out.println();
            if(row<((2*rows)-1)/2){
                nstn=nstn+2;
                val++;


            }
            else{
                nstn=nstn-2;
                val--;
            }
            row++;





        }

    }
}
