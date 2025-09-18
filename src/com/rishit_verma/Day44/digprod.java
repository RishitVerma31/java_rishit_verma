package com.rishit_verma.Day44;
import java.util.*;
public class digprod {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        int prod=1;
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] a= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter element number "+i+","+j);
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    prod*=a[i][j];
                }
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    a[i][j]=prod;
                }
            }

        }
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
