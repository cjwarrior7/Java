package com.company;
import java.util.Scanner;

public class Pattern17whileloop {


    public static void main(String[] args) {
        System.out.print("Enter the number of rows with while:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int row=0;
        int nsp=1;
        int nst=rows/2;
        while(row<rows){
            int cst=0;
            while(cst<nst){
                System.out.print("*"+" ");
                cst++;
            }
            int csp=0;
            while(csp<nsp){
                System.out.print(" "+" ");
                csp++;
            }
            cst=0;
            while(cst<nst){
                System.out.print("*"+" ");
                cst++;
            }
            System.out.println();
            if(row<rows/2){
                nsp=nsp+2;
                nst=nst-1;

            }
            else {
                nsp=nsp-2;
                nst=nst+1;
            }
            row++;
        }





    }
}


