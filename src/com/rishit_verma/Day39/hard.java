package com.rishit_verma.Day39;
import java.util.*;
public class hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=2*n-1;j++){
                if (j>=(n-i+1)&&j<=(n+i-1)&&(j-(n-i))%2==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next row
        }
    }
}