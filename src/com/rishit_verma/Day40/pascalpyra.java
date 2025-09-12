package com.rishit_verma.Day40;

import java.util.Scanner;

public class pascalpyra {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        for(int i=0;i<r;i++){
            int n=1;
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
                n=n*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
